package com.instawins.response;

/**
 * Response class for Random number generator
 */
public class RandomGeneratorResponse {

    private Integer randomNumber;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(Integer randomNumber) {
        this.randomNumber = randomNumber;
    }
}
