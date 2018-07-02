package com.bodhiye.forceid.rest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * Forceid REST Web程序启动类
 *
 * @author bodhiye
 * @Date 2018年5月29日09:00:42
 */
public class ForceidRestServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ForceidRestApplication.class);
    }

}
