package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicateCharacters {

    public void removeDuplicatesUsingHashSet(String s){

        HashSet<Character> hs = new HashSet<Character>();

        for(int i=0; i < s.length(); i++){

            char c = s.charAt(i);

            //Adding elements to hashSet -- only NON - duplicate elements will be added.
            hs.add(c);

        }

        StringBuffer sb = new StringBuffer();

        for(char a: hs){
            if(a != ' ')
            sb.append(a);
        }

        System.out.println("Final String using HashSet:" +sb);

    }

    public void removeDuplicatesUsingLinkedHashSet(String s){

        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

        for(int i=0; i < s.length(); i++){

            char c = s.charAt(i);

            //Adding elements to hashSet -- only NON - duplicate elements will be added.
            lhs.add(c);

        }

        StringBuilder sb = new StringBuilder();

        for(char a: lhs){
            if(a != ' ')
                sb.append(a);
        }

        System.out.println("Final String using LinkedHashSet:" +sb);

    }



    public void removeDuplicatesUsingIndexOf(String s){

        String newString = " ";

        for(int i=0; i < s.length(); i++){

            char c = s.charAt(i);

            if(c != ' ') {

                //Checking if character is  not present in String -- then adding it.
                if (newString.indexOf(c) == -1) {
                    newString = newString + c;
                }

            }

        }

        System.out.println("String is: " +newString);
    }


    public static void main(String[] args) {

        String str = "amazon";

        removeDuplicateCharacters obj = new removeDuplicateCharacters();
        //obj.removeDuplicatesUsingIndexOf(str);
        obj.removeDuplicatesUsingHashSet(str);
        obj.removeDuplicatesUsingLinkedHashSet(str);

    }

}
