package com.bodhiye.forceid.rest.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus配置
 *
 * @author bodhiye
 * @Date 2018年5月23日12:51:41
 */
@Configuration
@MapperScan(basePackages = {"com.bodhiye.forceid.rest.*.dao", "com.bodhiye.forceid.rest.common.persistence.dao"})
public class MybatisPlusConfig {

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
