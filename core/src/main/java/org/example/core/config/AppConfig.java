package org.example.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// Importing GameConfig allows us to load bean definitions from another configuration class (aka modularizing configuration)
@Import(GameConfig.class)
@ComponentScan(basePackages = "org.example")
public class AppConfig {
// == bean Methods == if you dont put the @Component annotation above the class then you can create the bean for the class here
// these are useful when you need additional configuration when creating a bean
//    @Bean
//    public NumberGenerator numberGenerator(){
//        return new NumberGeneratorImpl();
//    }
//
//    @Bean
//    public Game game(){
//        return new GameImpl();
//    }
//
//    @Bean
//    public MessageGenerator messageGenerator(){
//        return new MessageGeneratorImpl();
//    }

}
