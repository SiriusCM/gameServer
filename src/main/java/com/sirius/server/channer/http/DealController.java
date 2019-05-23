package com.sirius.server.channer.http;

import com.sirius.server.database.entity.News;
import com.sirius.server.service.impl.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Queue;

@RestController
@RequestMapping("/deal")
public class DealController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

    @RequestMapping(value = "/getNews", method = RequestMethod.GET)
    public Queue<News> getNews() {
        return newsService.getNews();
    }

    @RequestMapping(value = "/addNews", method = RequestMethod.POST)
    public News addNews(String title, String content) {
        News data = new News();
        data.setTitle(title);
        data.setContent(content);
        data.setTime(new Date());
        newsService.insert(data);
        return data;
    }
}
