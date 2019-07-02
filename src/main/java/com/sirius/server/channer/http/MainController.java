package com.sirius.server.channer.http;

import com.sirius.server.database.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        ResponseEntity<ModelAndView> responseEntity = restTemplate.getForEntity("http://service-provider/rpc/index", ModelAndView.class);
        return responseEntity.getBody();
    }

    @RequestMapping(value = "/getNews", method = RequestMethod.GET)
    public Queue<News> getNews() {
        ResponseEntity<Queue> responseEntity = restTemplate.getForEntity("http://service-provider/rpc/index", Queue.class);
        return responseEntity.getBody();
    }

    @RequestMapping(value = "/addNews", method = RequestMethod.POST)
    public News addNews(String title, String content) {
        Map<String, String> map = new HashMap<>();
        map.put("title", title);
        map.put("content", content);
        ResponseEntity<News> responseEntity = restTemplate.postForEntity("http://service-provider/rpc/index", map, News.class);
        return responseEntity.getBody();
    }
}
