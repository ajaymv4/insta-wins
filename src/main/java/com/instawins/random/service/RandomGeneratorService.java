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
     */
    public RandomGeneratorResponse generateRandomBasedOnSeed(int max){
        RandomGeneratorResponse response = new RandomGeneratorResponse();
        if(max > 0) {
            RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
            int randomWithRandomDataGenerator = randomDataGenerator.nextInt(1, max);
            response.setMessage("Success");
            response.setRandomNumber(randomWithRandomDataGenerator);
            return response;
        } else{
            response.setMessage("Max should be a positive number");
        }
        return response;
    }


}
