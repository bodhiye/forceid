package com.bodhiye.forceid.modular.application.service.impl;

import com.bodhiye.forceid.modular.system.model.Application;
import com.bodhiye.forceid.modular.system.dao.ApplicationMapper;
import com.bodhiye.forceid.modular.application.service.IApplicationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用表 服务实现类
 * </p>
 *
 * @author bodhiye123
 * @since 2018-07-01
 */
@Service
public class ApplicationServiceImpl extends ServiceImpl<ApplicationMapper, Application> implements IApplicationService {

}
