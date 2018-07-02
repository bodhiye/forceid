package com.bodhiye.forceid.core.util;

import com.bodhiye.forceid.config.properties.ForceidProperties;
import com.bodhiye.forceid.config.properties.ForceidProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(ForceidProperties.class).getKaptchaOpen();
    }
}