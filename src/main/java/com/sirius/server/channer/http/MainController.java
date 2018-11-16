package com.sirius.server.channer.http;

import com.sirius.server.database.mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private PlayerMapper playerMapper;

    @RequestMapping("/")
    public String hello() {
        return "this is a test string. Time:2017-10-29 20:42:00";
    }
}
