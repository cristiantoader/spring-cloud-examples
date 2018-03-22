package org.ctoader.spring;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by crist on 3/22/2018.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SpringPrincipalClientApp implements ApplicationRunner {


    @Autowired
    private ApplicationServerConfig applicationServerConfig;

    private static final Logger LOG = LoggerFactory.getLogger(SpringPrincipalClientApp.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringPrincipalClientApp.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOG.info("Message 1: {}", applicationServerConfig.getMessage1());
        LOG.info("Message 2: {}", applicationServerConfig.getMessage2());
        LOG.info("Message 3: {}", applicationServerConfig.getMessage3());
    }
}
