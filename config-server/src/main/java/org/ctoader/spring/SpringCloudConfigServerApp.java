package org.ctoader.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by crist on 3/22/2018.
 */
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerApp.class, args);
    }
}
