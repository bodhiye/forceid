package com.bodhiye.forceid;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Forceid Web程序启动类
 *
 * @author bodhiye
 * @Date 2018-05-21 9:43
 */
public class ForceidServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ForceidApplication.class);
    }
}
