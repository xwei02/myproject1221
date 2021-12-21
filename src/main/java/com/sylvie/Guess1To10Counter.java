package com.sylvie;

import java.util.Random;
import java.util.Scanner;

public class Guess1To10Counter {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int counter = 0;
        while (!game.end) {
            System.out.println("Please enter a number 1-10:");
            String s = scanner.next();
            n = Integer.parseInt(s);
            int diff = game.guess(n);
            if (diff>0) {
                System.out.println("Smaller");
            }
            if (diff<0) {
                System.out.println("Bigger");
            }
            if (diff==0){
                System.out.println("Bingo!");
            }
        }
        counter++;
    }
}
