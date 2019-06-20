package com.metaapp.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Mloong on 2019/03/05.
 * docker打包上传镜像命令：mvn clean package docker:build -DpushImage -Dspring.profiles.active=default
 */
@ComponentScan("com.metaapp")
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
