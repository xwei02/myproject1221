package com.sylvie;

import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        boolean end = false;

        public int guess(int n){
            return n - secret;
        }
        public boolean bigger(int n){
            if (n == secret) {
                end = true;
            }
            if (n > secret) {
                    end = true;
                }
            return n<secret;

            }
            public boolean smaller ( int n){
            if (n < secret) {
                    end = true;
                } else {
                    return false;
                }

            }
        }
    }
}
