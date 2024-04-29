package Strings;

/*
      Java program which intakes String and prints the duplicate characters along with number of times

      arun mootori

      a-1
      r-2
      u-1
      n-1
      m-1
      o-3
      t-1
      i-1
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findDuplicateCharacterCountString {

    public static void main(String[] args) {

        //1. take input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String str = sc.nextLine();

        //2.Take each character from the String and keep on adding to a Hashmap

        Map<Character, Integer> mapObj = new HashMap<Character, Integer>();

        for(int i=0; i < str.length(); i++){

            char c = str.charAt(i);

            //3. check if the character is already present in hashmap, if present update the value
            // If you try to insert the duplicate key, it will replace the element of the corresponding key.
            if(mapObj.containsKey(c)){

                //Key - character, value - number of times it occurs.
                mapObj.put(c, mapObj.get(c) + 1);

            }

            //4. if not present add the key,value to the hashmap
            else {
                mapObj.put(c, 1);
            }
        }

        //Iterating the hashmap to get keys

        for(char c: mapObj.keySet()){

            if(mapObj.get(c) > 1) //mapObj.get(c) -- returns the value of the character
            {

                System.out.println("Character " + c + " is returned: " +mapObj.get(c) + " times.");

            }

        }

        for(int i: mapObj.values()){
            System.out.println("Value of each char is: " +i);
        }


        for(Map.Entry<Character, Integer> entry: mapObj.entrySet()){
            System.out.println("key: " +entry.getKey() + " value: " +entry.getValue());
        }
    }
}
