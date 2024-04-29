package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatedCharacter {

    public void getFirstNonRepeatedCharacter(String s){

        Map<Character,Integer> mapObj = new LinkedHashMap<Character,Integer>();

        s = s.toLowerCase();

        for(int i=0; i < s.length(); i++){

            char c = s.charAt(i);

            if(mapObj.containsKey(c)){
                mapObj.put(c,mapObj.get(c)+1);
            } else {
                mapObj.put(c,1);
            }
        }

        String empty = "";


        for(char element: mapObj.keySet()){
            if(mapObj.get(element) >= 2){

            }else {
                empty = empty + element;
            }

            //System.out.println("Character " +element+ " is appearing: " +mapObj.get(element)+ " times");
        }

        System.out.println(empty);
        System.out.println("First non repeated character is: " +empty.charAt(0));
    }


    public static void main(String[] args) {

        String str = "Amazon";
        firstNonRepeatedCharacter obj = new firstNonRepeatedCharacter();
        obj.getFirstNonRepeatedCharacter(str);

    }


}
