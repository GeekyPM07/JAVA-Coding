package Strings;

import java.util.Scanner;

public class Palindrome {


    public boolean isPalindrome(String s){

        String rev = "";

        for(int i=s.length()-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }

        if(rev.equals(s)){
            System.out.println("String is palindrome");
            return true;
        } else {
            System.out.println("String is not palindrome");
            return false;
        }
    }

    public boolean checkPalindromeNumber(int x){

        int rev = 0;
        int originalNumber = x;

        while(x>0){
            rev = rev*10 + x%10;
            x = x/10;

        }

        if(Integer.compare(originalNumber,rev) == 0){
            System.out.println("Integer is palindrome");
            return true;
        } else {
            System.out.println("Integer is NOT palindrome");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Palindrome pm = new Palindrome();

        System.out.println("Do you want to check a String or a Number ?");
        System.out.println("Press 1 for checking String");
        System.out.println("OR");
        System.out.println("Press 2 for checking Number");

        int choice = sc.nextInt();

        switch (choice){

            case 1:

                System.out.println("Enter a String to check: ");
                String str = sc.next();
                pm.isPalindrome(str);
                break;

            case 2:

                System.out.println("Enter a Number to check: ");
                int number = sc.nextInt();
                pm.checkPalindromeNumber(number);
                break;

        }
    }
}
