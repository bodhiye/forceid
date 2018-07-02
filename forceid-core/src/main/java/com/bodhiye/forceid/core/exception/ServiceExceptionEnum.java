package com.bodhiye.forceid.core.exception;

/**
 * 抽象接口
 *
 * @author bodhiye
 * @Date 2018-05-28-下午10:27
 */
public interface ServiceExceptionEnum {

    /**
     * 获取异常编码
     */
    Integer getCode();

    /**
     * 获取异常信息
     */
    String getMessage();
}
