package org.example.console;

import org.example.core.Game;
import org.example.core.MessageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleNumberGuess {

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    // == fields ==
    @Autowired
    private Game game;
    @Autowired
    private MessageGenerator messageGenerator;

    // == events ==
    @EventListener(ContextRefreshedEvent.class)
    public void start() {
        //this method will fire when the application context is refreshed (when the application context object is ready for use)
        // you can use the @EventListener annotation or implement the interface with implements ApplicationListener<ContextRefreshedEvent>
        log.info("start() --> Container ready for use");


        Scanner scanner = new Scanner(System.in);

        // infinite loop to keep game running
        while (true) {
            System.out.println(messageGenerator.getMainMessage());
            System.out.println(messageGenerator.getResultMessage());

            int guess = scanner.nextInt();
            scanner.nextLine();
            game.setGuess(guess);
            game.check();

            if (game.isGameWon() || game.isGameLost()) {
                System.out.println(messageGenerator.getResultMessage());
                System.out.println("Play again y/n?");

                String playAgainString = scanner.nextLine().trim();
                if (!playAgainString.equalsIgnoreCase("y")) {
                    break;
                }
                game.reset();
            }
        }

    }


}
