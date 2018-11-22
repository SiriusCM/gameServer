package com.sirius.server.database.service;

import com.sirius.server.database.data.NewsData;

import java.util.Queue;

/**
 * create by gaoliandi on 2018/11/22
 **/
public interface NewsService extends Service {
	
	Queue<NewsData> getNews();
	
	void insert(NewsData data);
}
