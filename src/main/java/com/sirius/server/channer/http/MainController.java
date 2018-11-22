package com.sirius.server.channer.http;

import com.sirius.server.database.data.NewsData;
import com.sirius.server.database.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Queue;

@RestController
public class MainController {
	
	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index.html");
	}
	
	@RequestMapping(value = "/getNews", method = RequestMethod.GET)
	public Queue<NewsData> getNews() {
		return newsService.getNews();
	}
	
	@RequestMapping(value = "/addNews", method = RequestMethod.POST)
	public NewsData addNews(String title, String content) {
		NewsData data = new NewsData();
		data.setTitle(title);
		data.setContent(content);
		data.setTime(System.currentTimeMillis());
		newsService.insert(data);
		return data;
	}
}
