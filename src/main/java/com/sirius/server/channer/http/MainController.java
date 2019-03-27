package com.sirius.server.channer.http;

import com.sirius.server.database.data.NewsData;
import com.sirius.server.database.model.impl.NewsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.Queue;

@RestController
@RequestMapping("/")
public class MainController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private NewsModel newsModel;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		Queue<NewsData> queue = restTemplate.getForObject("http://service-provider/getNews", Queue.class);
		return new ModelAndView("index.html");
	}

	@RequestMapping(value = "/getNews", method = RequestMethod.GET)
	public Queue<NewsData> getNews() {
		return newsModel.getNews();
	}

	@RequestMapping(value = "/addNews", method = RequestMethod.POST)
	public NewsData addNews(String title, String content) {
		NewsData data = new NewsData();
		data.setTitle(title);
		data.setContent(content);
		data.setTime(System.currentTimeMillis());
		newsModel.insert(data);
		return data;
	}
}
