package com.bodhiye.forceid.modular.system.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bodhiye.forceid.modular.system.dao.LoginLogMapper;
import com.bodhiye.forceid.modular.system.model.LoginLog;
import com.bodhiye.forceid.modular.system.model.OperationLog;
import com.bodhiye.forceid.modular.system.service.ILoginLogService;
import com.bodhiye.forceid.modular.system.dao.LoginLogMapper;
import com.bodhiye.forceid.modular.system.model.LoginLog;
import com.bodhiye.forceid.modular.system.model.OperationLog;
import com.bodhiye.forceid.modular.system.service.ILoginLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 登录记录 服务实现类
 * </p>
 *
 * @author bodhiye
 * @since 2018-02-22
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

    @Override
    public List<Map<String, Object>> getLoginLogs(Page<OperationLog> page, String beginTime, String endTime, String logName, String orderByField, boolean asc) {
        return this.baseMapper.getLoginLogs(page, beginTime, endTime, logName, orderByField, asc);
    }
}
