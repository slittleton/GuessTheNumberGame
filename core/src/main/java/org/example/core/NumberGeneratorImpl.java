package org.example.core;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

//@Component
public class NumberGeneratorImpl implements NumberGenerator{
    // == fields ==
    private final Random random = new Random();
    @Autowired
    @MaxNumber
    private int maxNumber;

    // == public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
