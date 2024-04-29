package MathProblems;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Enter the number till you want to print the fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 1;
        int b = 1;

        System.out.print(a + " " + b);

        int fb = 0;

        while (fb < num){

            fb = a + b;
            a = b;
            b = fb;

            if(fb < num)
            System.out.print(" " +fb + " ");

        }
    }
}
