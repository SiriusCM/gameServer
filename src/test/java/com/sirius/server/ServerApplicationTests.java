package com.sirius.server;

import com.sirius.server.service.impl.IdService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.ElementType;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

    @Autowired
    private IdService idService;

    @Test
    public void contextLoads() {
        long id = idService.applyId(ElementType.TYPE);
    }

}
