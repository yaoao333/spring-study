package com.yao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration//这是一个配置类，用于完全替代xml
@ComponentScan("com.yao")//指定扫描范围
@Import(DataSourceConfiguration.class)//导入其他配置类，类似于总xml导入其他小xml
public class SpringConfiguration {
}
