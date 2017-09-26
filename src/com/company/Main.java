package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("What is your word");
        String word = in.next();
        int opp = (int)(Math.random()*word.length());

        for (int i = 0; i<word.length(); i++){

            if (opp % 5 == 0){


                System.out.print(word.charAt(i));
                opp++;

            }else if (opp % 4 == 0) {

                System.out.print(Integer.toHexString(((int) word.charAt(i))));
                opp++;

            }else if (opp % 3 == 0) {

                System.out.print((int) word.charAt(i));
                opp++;

            }else if (opp % 2 == 0)  {

                System.out.print(Integer.toOctalString(((int) word.charAt(i))));
                opp++;

            }else if (opp % 1 == 0) {

                System.out.print(Integer.toBinaryString(((int) word.charAt(i))));
                opp++;

            }else {

                System.out.println("error");

            }

        }

    }
}
//slight method help credit to Luke