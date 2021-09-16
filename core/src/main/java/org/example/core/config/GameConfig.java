package org.example.core.config;

import org.example.core.GuessCount;
import org.example.core.MaxNumber;
import org.example.core.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/config/game.properties")
public class GameConfig {
    // == fields ==
    // game.maxNumber:defaultValue
    @Value("${game.maxNumber:50}")
    private int maxNumber;

    @Value("${game.guessCount:8}")
    private int guessCount;

    @Value("${game.minNumber:27}")
    private int minNumber;

    // == bean methods ==`
    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    // by creating and using a custom annotation you can change the method name to whatever you want and spring
    // will still understand that this method refers to the Bean that gives you the guessCount
    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }

}
