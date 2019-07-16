package com.sirius.server.channer.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

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
}
