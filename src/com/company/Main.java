package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char a;
        int opp;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your word");
        String word = in.next();
        if (word.length() % 5 == 0) {

            int opp = 5;

        } else if (word.length() % 4 == 0) {

            int opp = 4;

        }else if (word.length() % 3 == 0) {

            int opp = 3;

        }else if (word.length() % 2 == 0) {

            int opp = 2;

        }else if (word.length() % 1 == 0) {

            int opp = 1;

        }else {

            System.out.println("invalid input");

        }

        int count = 0;
        for (int i = 0; i<word.length(); i++){

            word.substring(i, i+1)=a;
            if (opp % 5 == 0){
                
                System.out.println();

            }

        }

    }
}
