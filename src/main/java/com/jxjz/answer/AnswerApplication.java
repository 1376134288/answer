package com.jxjz.answer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.jxjz.answer.dao"})
@ComponentScan(basePackages = {"com.jxjz.answer.*"})
public class AnswerApplication implements CommandLineRunner{
    private Logger logger = LoggerFactory.getLogger(AnswerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AnswerApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        logger.info("服务启动完成!");
    }
}
