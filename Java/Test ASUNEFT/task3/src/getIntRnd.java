package task3.src;

import java.util.Random;

public class getIntRnd {
    public static int rndGenerator(int min, int max){
        // Random rnd = new Random();
        // return  rnd.nextInt((max - min) + 1) + min;
        return (int)(Math.random()*((max - min) + 1)) + min;
    }
}
