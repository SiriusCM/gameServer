package com.sirius.server.channer.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@RestController
@RequestMapping("/rpc")
public class RpcController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }
}
