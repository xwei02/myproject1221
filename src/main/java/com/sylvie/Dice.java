package com.sylvie;
import java.util.Random;
public class Dice {
    int point = 1;
    public void roll(){
        System.out.println("rolling");
        Random random = new Random();
        point = random.nextInt(6)+1;
    }

}
