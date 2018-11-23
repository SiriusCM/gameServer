package com.sirius.server.database.model;

import com.sirius.server.database.data.NewsData;
import com.sirius.server.database.entity.News;
import com.sirius.server.database.entity.NewsExample;
import com.sirius.server.database.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class NewsModel implements Model {

    private Queue<NewsData> queue = new ConcurrentLinkedQueue<>();

    @Autowired
    private NewsMapper newsMapper;

    public void init() {
        List<News> list = newsMapper.selectByExample(null);
        list.forEach(news -> queue.offer(new NewsData(news)));
    }

    public Queue<NewsData> getNews() {
        return queue;
    }

    public void insert(NewsData data) {
        queue.add(data);
        newsMapper.insert(data.toNews());
    }

    public void deleteBefore() {
        NewsExample example = new NewsExample();
        example.createCriteria().andTimeLessThan(new Date());
        newsMapper.deleteByExample(example);
    }
}