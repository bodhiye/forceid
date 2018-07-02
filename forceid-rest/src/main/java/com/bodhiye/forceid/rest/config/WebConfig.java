package com.bodhiye.forceid.rest.config;

import com.bodhiye.forceid.rest.config.properties.RestProperties;
import com.bodhiye.forceid.rest.modular.auth.filter.AuthFilter;
import com.bodhiye.forceid.rest.modular.auth.security.DataSecurityAction;
import com.bodhiye.forceid.rest.modular.auth.security.impl.Base64SecurityAction;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * web配置
 *
 * @author bodhiye
 * @Date 2018-08-23 15:48
 */
@Configuration
public class WebConfig {

    @Bean
    @ConditionalOnProperty(prefix = RestProperties.REST_PREFIX, name = "auth-open", havingValue = "true", matchIfMissing = true)
    public AuthFilter jwtAuthenticationTokenFilter() {
        return new AuthFilter();
    }

    @Bean
    public DataSecurityAction dataSecurityAction() {
        return new Base64SecurityAction();
    }
}
