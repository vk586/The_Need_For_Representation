package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = sc.next();
        String ecr1;
        String fnl = "";

        // rndF - where representation begins
        int rndF = (int)((Math.random() * 5) + 1);
        int rndH = ((int)((Math.random() * 100)));
        double rnd = (rndH / 100.0) * word.length();

        // rndP - starting point determined from percentage
        int rndP = (int)(rnd);

        // initializes representation and position
        int rep = rndF;
        int pos = rndP;

        for (int i = 1; i <= word.length(); i++) {
            // ascii to decimal
            int atd = (int)(word.charAt(pos));

            if (rep == 1)
            {
                ecr1 = Integer.toBinaryString(atd);
            }
            else if (rep == 2)
            {
                ecr1 = Integer.toOctalString(atd);
            }
            else if (rep == 3)
            {
                ecr1 = Integer.toString(atd);
            }
            else if (rep == 4)
            {
                ecr1 = Integer.toHexString(atd);
            }
            else
            {
                ecr1 = word.substring(pos, pos + 1);
            }

            rep++;
            if (rep > 5) {
                rep = 1;
            }

            pos++;
            if (pos >= word.length()) {
                pos = 0;
            }

            /* debugging/testing purposes
            System.out.println("strt: " + strt);
            System.out.println("rep: " + rep); */

            fnl = fnl + ecr1;
            }

        System.out.println("Your encrypted word is: " + fnl);
    }
}
