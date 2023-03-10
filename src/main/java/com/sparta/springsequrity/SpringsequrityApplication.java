package com.sparta.springsequrity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@EnableScheduling
@SpringBootApplication
public class SpringsequrityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsequrityApplication.class, args);
    }

}
