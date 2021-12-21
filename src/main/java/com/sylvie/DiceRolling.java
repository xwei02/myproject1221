package com.sylvie;

public class DiceRolling {
    public static void main(String[] args) {
        int [] counters = new int[6];
        Dice dice = new Dice();
        for (int i = 0; i < 10; i++) {
            dice.roll();
            System.out.print(dice.point);
            if (dice.point == 6){
                System.out.println("*");
            }else {
                System.out.println();
            }
            counters[dice.point-1]++;

        }
        int max = 0;
        int point = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+" "+counters[i]+"times");
            if (counters[i]>max){
                max = counters[i];
                point = i+1;
            }

        }
    }
}
