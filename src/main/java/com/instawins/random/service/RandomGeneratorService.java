package com.instawins.random.service;

import com.instawins.response.RandomGeneratorResponse;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RandomGeneratorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomGeneratorService.class);

    /**
     * This method generates a random number not greater than passed param
     * @param max
     * @return
     */
    public RandomGeneratorResponse generateRandomBasedOnSeed(int max){
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        int randomWithRandomDataGenerator = randomDataGenerator.nextInt(1, max);
        RandomGeneratorResponse response = new RandomGeneratorResponse();
        response.setRandomNumber(randomWithRandomDataGenerator);
        return response;
    }


}
