package com.funtl.hello.apache.shardingsphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.funtl.hello.apache.shardingsphere.mapper")
public class HelloApacheShardingsphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApacheShardingsphereApplication.class, args);
    }

}
