package org.example.console;

import org.example.core.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // close context (container)
        context.close();
    }
}
