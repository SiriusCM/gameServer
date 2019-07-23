package com.sirius.server.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sirius.server.event.Init;
import com.sirius.server.service.IService;
import io.micrometer.core.instrument.util.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @Date:2019/7/23 11:41
 * @Author:gaoliandi
 */
@Service
public class WeatherService implements IService {

    @Autowired
    private HttpService httpService;

    @Init
    public void init() throws IOException {
        CloseableHttpClient httpClient = httpService.getHttpsClient();
        HttpPost httpPost = new HttpPost("https://www.tianqiapi.com/api/");
        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
        InputStream inputStream = httpResponse.getEntity().getContent();
        String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        JSONObject jsonObject = JSON.parseObject(result);
        JSONArray data = jsonObject.getJSONArray("data");
    }
}
