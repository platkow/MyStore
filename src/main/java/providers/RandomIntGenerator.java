package providers;

import java.util.Random;

public class RandomIntGenerator {
    static Random rnd = new Random();

    public static int generateRandomInt(int bound){
        return rnd.nextInt(bound);
    }

    public static int generateRandomInt(int min, int max){
        return rnd.nextInt((max - min) + min);
    }
}
