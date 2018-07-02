package com.bodhiye.forceid.generator.action;


import com.bodhiye.forceid.generator.action.config.ForceidGeneratorConfig;
import com.bodhiye.forceid.generator.action.config.ForceidGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service,controller,html,js
 *
 * @author bodhiye
 * @Date 2018/5/21 12:38
 */
public class ForceidCodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        ForceidGeneratorConfig forceidGeneratorConfig = new ForceidGeneratorConfig();
        forceidGeneratorConfig.doMpGeneration();

        /**
         * forceid的生成器:
         *      forceid的代码生成器可以生成controller,html页面,页面对应的js
         */
        forceidGeneratorConfig.doForceidGeneration();
    }

}