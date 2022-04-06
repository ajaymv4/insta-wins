package com.instawins.random.controller;

import com.instawins.random.service.RandomGeneratorService;
import com.instawins.response.RandomGeneratorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomGeneratorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomGeneratorController.class);

    @Autowired
    private RandomGeneratorService randomGeneratorService;

    @GetMapping(value = "/random/generate/{max}")
    public RandomGeneratorResponse generateRandomBasedOnSeed(@PathVariable Integer max){
        return randomGeneratorService.generateRandomBasedOnSeed(max);
    }



}
