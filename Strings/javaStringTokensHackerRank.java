package Strings;

/*
        Given a string, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
        We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.



        Note: You may find the String.split method helpful in completing this challenge.

        Input Format
        A single string, s.

        Output Format
        On the first line, print an integer, denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

        Sample Input
        He is a very very good boy, isn't he?

        Sample Output
        10
        He
        is
        a
        very
        very
        good
        boy
        isn
        t
        he

*/

import java.util.Scanner;

public class javaStringTokensHackerRank {

    static String x = "x";


    public static void main(String[] args) {

        String s = "He is a very very good boy, isn't he?";

        String s1[] = s.split("[ !,?._'@]+");

        int tokens = 0;

        for(int i=0; i < s1.length; i++){
            if(s1[i].length() > 0){
                tokens++;
            }
        }

        System.out.println(tokens);

        for(String el: s1){
            if(el.length() > 0){
                System.out.println(el);
            }
        }
    }
}

