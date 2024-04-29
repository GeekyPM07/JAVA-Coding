package Strings;

import java.util.regex.Pattern;

public class findNumbersLettersSpaces {

    public static void main(String[] args) {

        String str = "$%# are the 3 symbols";

        int letter = 0;
        int space = 0;
        int number = 0;
        int others = 0;

        for (int i=0; i < str.length(); i++){

            char c = str.charAt(i);

            if(Character.isLetter(c)){
                letter++;
            }else if (Character.isDigit(c)){
                number++;
            } else if (Character.isSpaceChar(c)) {
                space++;
            }else {
                others++;
            }
        }

        System.out.println("Numbers: " +number);
        System.out.println("Space: " +space);
        System.out.println("Letters: "+letter);
        System.out.println("Others: " +others);
    }
}
