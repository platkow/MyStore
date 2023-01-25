package providers;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator {

    public String generateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }

    public String generateRandomString(int lowerBound, int upperBound){
        return RandomStringUtils.randomAlphabetic(lowerBound, upperBound);
    }

    public String generateRandomEmail(int length){
        return RandomStringUtils.randomAlphabetic(length) + "@domain.com";
    }
}
