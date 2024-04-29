package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findAllCharacterCountString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String str = sc.nextLine();

        Map<Character,Integer> hashMapObj = new HashMap<Character,Integer>();

        for(int i=0; i < str.length(); i++){

            char c = str.charAt(i);

            if(hashMapObj.containsKey(c)){

                hashMapObj.put(c,hashMapObj.get(c)+1);

            } else {
                hashMapObj.put(c,1);
            }
        }

        //Iterating over keys

        for (char c: hashMapObj.keySet()){

            System.out.println("Character " + c + " occured: " + hashMapObj.get(c) + " times");

        }

        //Iterating over hashmap to get both keys and values

        for(Map.Entry<Character, Integer> entrySet : hashMapObj.entrySet()){
            System.out.println("Key : " +entrySet.getKey() + " Value: " +entrySet.getValue());
        }
    }
}
