package com.sirius.server.database.service;

import com.sirius.server.database.data.NewsData;
import com.sirius.server.database.entity.News;
import com.sirius.server.database.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * create by gaoliandi on 2018/11/22
 **/
@Service
public class NewsServiceImpl implements NewsService {
	
	private Queue<NewsData> queue = new ConcurrentLinkedQueue<>();
	
	@Autowired
	private NewsMapper newsMapper;
	
	public void init() {
		List<News> list = newsMapper.selectByExample(null);
		list.forEach(news -> queue.offer(new NewsData(news)));
	}
	
	@Override
	public Queue<NewsData> getNews() {
		return queue;
	}
	
	@Override
	public void insert(NewsData data) {
		queue.add(data);
		newsMapper.insert(data.toNews());
	}
}