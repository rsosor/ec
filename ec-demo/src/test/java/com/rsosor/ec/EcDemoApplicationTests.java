package com.rsosor.ec;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rsosor.ec.model.PmsProduct;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcDemoApplicationTests {

    private Logger logger = LoggerFactory.getLogger(EcDemoApplicationTests.class);

    @Test
    public void contextLoads() {
    }

    @Test
    public void testLogStash() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PmsProduct product = new PmsProduct();
        product.setId(1L);
        product.setName("小米手機");
        product.setBrandName("小米");
        logger.info(mapper.writeValueAsString(product));
        logger.error(mapper.writeValueAsString(product));
    }
}
