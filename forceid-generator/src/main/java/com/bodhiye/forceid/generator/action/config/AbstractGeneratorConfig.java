package com.bodhiye.forceid.generator.action.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.bodhiye.forceid.core.util.FileUtil;
import com.bodhiye.forceid.generator.engine.base.ForceidTemplateEngine;
import com.bodhiye.forceid.generator.engine.config.ContextConfig;
import com.bodhiye.forceid.generator.engine.config.SqlConfig;
import com.bodhiye.forceid.core.util.FileUtil;
import com.bodhiye.forceid.generator.engine.SimpleTemplateEngine;
import com.bodhiye.forceid.generator.engine.base.ForceidTemplateEngine;
import com.bodhiye.forceid.generator.engine.config.ContextConfig;
import com.bodhiye.forceid.generator.engine.config.SqlConfig;

import java.io.File;
import java.util.List;

/**
 * 代码生成的抽象配置
 *
 * @author bodhiye
 * @Date 2018-10-28-下午8:22
 */
public abstract class AbstractGeneratorConfig {

    /**
     * mybatis-plus代码生成器配置
     */
    GlobalConfig globalConfig = new GlobalConfig();

    DataSourceConfig dataSourceConfig = new DataSourceConfig();

    StrategyConfig strategyConfig = new StrategyConfig();

    PackageConfig packageConfig = new PackageConfig();

    TableInfo tableInfo = null;

    /**
     * Forceid代码生成器配置
     */
    ContextConfig contextConfig = new ContextConfig();

    SqlConfig sqlConfig = new SqlConfig();

    protected abstract void config();

    public void init() {
        config();

        packageConfig.setService(contextConfig.getProPackage() + ".modular." + contextConfig.getModuleName() + ".service");
        packageConfig.setServiceImpl(contextConfig.getProPackage() + ".modular." + contextConfig.getModuleName() + ".service.impl");

        //controller没用掉,生成之后会自动删掉
        packageConfig.setController("TTT");

        if (!contextConfig.getEntitySwitch()) {
            packageConfig.setEntity("TTT");
        }

        if (!contextConfig.getDaoSwitch()) {
            packageConfig.setMapper("TTT");
            packageConfig.setXml("TTT");
        }

        if (!contextConfig.getServiceSwitch()) {
            packageConfig.setService("TTT");
            packageConfig.setServiceImpl("TTT");
        }

    }

    /**
     * 删除不必要的代码
     */
    public void destory() {
        String outputDir = globalConfig.getOutputDir() + "/TTT";
        FileUtil.deleteDir(new File(outputDir));
    }

    public AbstractGeneratorConfig() {
    }

    public void doMpGeneration() {
        init();
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.setPackageInfo(packageConfig);
        autoGenerator.execute();
        destory();

        //获取table信息,用于forceid代码生成
        List<TableInfo> tableInfoList = autoGenerator.getConfig().getTableInfoList();
        if (tableInfoList != null && tableInfoList.size() > 0) {
            this.tableInfo = tableInfoList.get(0);
        }
    }

    public void doForceidGeneration() {
        ForceidTemplateEngine ForceidTemplateEngine = new SimpleTemplateEngine();
        ForceidTemplateEngine.setContextConfig(contextConfig);
        sqlConfig.setConnection(dataSourceConfig.getConn());
        ForceidTemplateEngine.setSqlConfig(sqlConfig);
        ForceidTemplateEngine.setTableInfo(tableInfo);
        ForceidTemplateEngine.start();
    }
}
