package org.ctoader.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by crist on 3/22/2018.
 */
@Component
public class ApplicationServerConfig {

    @Value("${cfg.message1}")
    private String message1;

    @Value("${cfg.message2}")
    private String message2;

    @Value("${cfg.message3}")
    private String message3;


    public String getMessage1() {
        return message1;
    }

    public String getMessage2() {
        return message2;
    }

    public String getMessage3() {
        return message3;
    }
}
