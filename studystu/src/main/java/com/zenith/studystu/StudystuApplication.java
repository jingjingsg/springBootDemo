package com.zenith.studystu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StudystuApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudystuApplication.class, args);
    }

}
