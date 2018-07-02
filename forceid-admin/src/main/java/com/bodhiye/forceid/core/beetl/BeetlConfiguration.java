package com.bodhiye.forceid.core.beetl;

import com.bodhiye.forceid.core.util.KaptchaUtil;
import com.bodhiye.forceid.core.util.ToolUtil;
import com.bodhiye.forceid.core.util.KaptchaUtil;
import com.bodhiye.forceid.core.util.ToolUtil;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

/**
 * beetl拓展配置,绑定一些工具类,方便在模板中直接调用
 *
 * @author bodhiye
 * @Date 2018/5/22 21:03
 */
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Override
    public void initOther() {
        groupTemplate.registerFunctionPackage("shiro", new ShiroExt());
        groupTemplate.registerFunctionPackage("tool", new ToolUtil());
        groupTemplate.registerFunctionPackage("kaptcha", new KaptchaUtil());
    }
}
