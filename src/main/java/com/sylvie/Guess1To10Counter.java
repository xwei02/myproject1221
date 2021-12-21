package com.sylvie;

import java.util.Random;
import java.util.Scanner;

public class Guess1To10Counter {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int counter=0;
        boolean Game = false;
        while (!Game) {
            System.out.println("Please enter a number 1-10:");
            String s = scanner.next();
            n = Integer.parseInt(s);
            if (n > secret) {
                System.out.println("Smaller");
            }
            if (n < secret) {
                System.out.println("Bigger");
            }
            if (n==secret){
                System.out.println("Bingo!");
                Game = true;
            }
            counter++;
        }
    }
}
