package com.sirius.server.manager.impl;

import com.sirius.server.database.entity.News;
import com.sirius.server.database.entity.NewsExample;
import com.sirius.server.database.mapper.NewsMapper;
import com.sirius.server.manager.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@org.springframework.stereotype.Service
public class NewsService implements Service {

    private Queue<News> queue = new ConcurrentLinkedQueue<>();

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public void init() {
        List<News> list = newsMapper.selectByExample(null);
        list.forEach(news -> queue.offer(news));
        logger.info("NewsMode init");
    }

    @Override
    public void destroy() {

    }

    public Queue<News> getNews() {
        return queue;
    }

    public void insert(News data) {
        queue.add(data);
        newsMapper.insert(data);
    }

    public void deleteBefore() {
        queue.clear();
        NewsExample example = new NewsExample();
        example.createCriteria().andTimeLessThan(new Date());
        newsMapper.deleteByExample(example);
    }
}