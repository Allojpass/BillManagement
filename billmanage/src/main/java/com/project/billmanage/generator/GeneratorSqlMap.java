package com.project.billmanage.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorSqlMap {
    public static void main(String[] args) throws Exception {
        GeneratorSqlMap generatorSqlMap = new GeneratorSqlMap();
        generatorSqlMap.generator();
    }
    public void generator() throws Exception{
        //warnings用于放置生成过程中警告信息的生成对象
        List<String> warnings = new ArrayList<>();
        //指定是否覆盖重名文件
        boolean overwrite = true;
        //加载配置文件
        File configFile = new File("E:\\IDEAproject\\billmanage\\src\\main\\java\\com\\project\\billmanage\\generator\\mybatis-generator-config.xml");
        //配置解析类
        ConfigurationParser cp = new ConfigurationParser(warnings);
        //配置解析类解析配置文件并生成Configuration配置对象
        Configuration config = cp.parseConfiguration(configFile);
        //ShellCallback负责如何处理重复文件
        ShellCallback callback = new DefaultShellCallback(overwrite);
        //逆向工程对象
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
    }
}
