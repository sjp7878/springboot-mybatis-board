package com.practice.board.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.practice.board.mapper")
public class MybatisConfig {

}
