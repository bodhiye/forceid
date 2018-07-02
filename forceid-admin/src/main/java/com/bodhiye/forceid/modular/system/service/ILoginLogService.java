package com.bodhiye.forceid.modular.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.bodhiye.forceid.modular.system.model.LoginLog;
import com.bodhiye.forceid.modular.system.model.OperationLog;
import com.bodhiye.forceid.modular.system.model.LoginLog;
import com.bodhiye.forceid.modular.system.model.OperationLog;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 登录记录 服务类
 * </p>
 *
 * @author bodhiye
 * @since 2018-02-22
 */
public interface ILoginLogService extends IService<LoginLog> {

    /**
     * 获取登录日志列表
     */
    List<Map<String, Object>> getLoginLogs(Page<OperationLog> page, String beginTime, String endTime, String logName, String orderByField, boolean asc);
}
