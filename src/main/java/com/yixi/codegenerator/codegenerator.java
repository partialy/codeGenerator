package com.yixi.codegenerator;

import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


public class codegenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/yipan?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai", "root", "root")
                .globalConfig(builder -> {
                    builder.author("yixi")
                            .dateType(DateType.ONLY_DATE)
//                            .fileOverride()
                            .enableSwagger()
                            .commentDate("yyyy-MM-dd")
                            .outputDir("D:\\workspace\\myworkspace-java\\Codes\\java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.yixi.yipan") // 设置父包名
                            .entity("entity")        // 设置实体包名
                            .service("service")      // 设置service包名
                            .serviceImpl("service.impl") // 设置service impl包名
                            .mapper("mapper")        // 设置mapper包名
                            .xml("mapper.xml")       // 设置mapper xml包名
                            .controller("controller") // 设置controller包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml,
                                    "D:\\workspace\\myworkspace-java\\Codes\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("file", "user") // 设置需要生成的表名
                            .entityBuilder()
                            .enableLombok()
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            .enableRestStyle()
                            .mapperBuilder()
                            .enableMapperAnnotation() // 开启 @Mapper 注解
                            .build();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
