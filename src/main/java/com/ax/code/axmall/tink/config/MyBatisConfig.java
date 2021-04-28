package com.ax.code.axmall.tink.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ax.code.axmall.mapper")
public class MyBatisConfig {
}
