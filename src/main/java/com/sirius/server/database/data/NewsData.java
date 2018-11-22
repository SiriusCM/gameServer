package com.sirius.server.database.data;

import com.sirius.server.database.entity.News;

import java.util.Date;

/**
 * create by gaoliandi on 2018/11/22
 **/
public class NewsData {
	
	private String title;
	private String content;
	private long time;
	
	public NewsData() {
	}
	
	public NewsData(News news) {
		this.title = news.getTitle();
		this.content = news.getContent();
		this.time = news.getTime().getTime();
	}
	
	public News toNews() {
		News news = new News();
		news.setTitle(title);
		news.setContent(content);
		news.setTime(new Date(time));
		return news;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public long getTime() {
		return time;
	}
	
	public void setTime(long time) {
		this.time = time;
	}
}
