package org.example.console;

import org.example.core.*;
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

        // get number generator bean from context(container)
        NumberGenerator numberGenerator = context.getBean(NumberGeneratorImpl.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        log.info("number = {}", number);
        MessageGenerator msg = context.getBean(MessageGeneratorImpl.class);

        log.info("getMessage= {}", msg.getMainMessage());;
        log.info("getMessage= {}", msg.getResultMessage());;

        // close context (container)
        context.close();
    }
}
