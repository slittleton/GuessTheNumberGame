package org.example.core.config;

import org.example.core.GuessCount;
import org.example.core.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    // == fields ==
    private int maxNumber = 50;
    private int guessCount = 8;


    // == bean methods ==
    @Bean
    @MaxNumber
    public int MaxNumber(){
        return maxNumber;
    }

    // by creating and using a custom annotation you can change the method name to whatever you want and spring
    // will still understand that this method refers to the Bean that gives you the guessCount
    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

}
