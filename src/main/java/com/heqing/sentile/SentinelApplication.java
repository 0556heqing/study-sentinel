package com.heqing.sentile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author heqing
 * @date 2021/7/14 10:40
 */

@SpringBootApplication
public class SentinelApplication {

    public static void main(String[] args) {
        new SpringApplication(SentinelApplication.class).run(args);
    }

}
