package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findIndividualCharacterCountString {

    public void usingHashMap(String str){

        Map<Character,Integer> hashMapObj = new HashMap<Character,Integer>();

        for(int i=0; i < str.length(); i++){

            char c = str.charAt(i);

            if(hashMapObj.containsKey(c)){

                hashMapObj.put(c,hashMapObj.get(c)+1);

            } else {
                hashMapObj.put(c,1);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to find count of: ");
        String c = sc.next();
        char a = c.charAt(0);

        if(hashMapObj.containsKey(a)){
            System.out.println("Character " +a+ " is occurring: " +hashMapObj.get(a)+ " times");
        }

    }

    public void usingCharArray(String str){

        char arr[] = str.toCharArray();

        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to find count of: ");
        String a = sc.next();
        char c = a.charAt(0);

        for(int i=0; i < arr.length; i++){

            if(arr[i] == c){
                count++;
            }
        }

        System.out.println("Character " +c+ " is occurring: " +count+ " times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = sc.nextLine();

        findIndividualCharacterCountString obj = new findIndividualCharacterCountString();
        obj.usingHashMap(str);
        obj.usingCharArray(str);

    }
}
