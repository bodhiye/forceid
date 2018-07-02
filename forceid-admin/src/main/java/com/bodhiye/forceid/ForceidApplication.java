package com.bodhiye.forceid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot方式启动类
 *
 * @author bodhiye
 * @Date 2018/5/21 12:06
 */
@SpringBootApplication
public class ForceidApplication {

    private final static Logger logger = LoggerFactory.getLogger(ForceidApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ForceidApplication.class, args);
        logger.info("ForceidApplication is success!");
    }
}
