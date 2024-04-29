package Strings;

import java.util.HashMap;
import java.util.Map;

public class countDuplicateWordsString {

    public void findDuplicateWords(String s){

        String splitArray[] = s.split(" ");

        Map<String, Integer> hMap = new HashMap<String, Integer>();

        for(String word: splitArray){

            if(hMap.containsKey(word)){
                hMap.put(word.toLowerCase(), hMap.get(word)+1);
            } else {
                hMap.put(word, 1);
            }
        }

        System.out.println("Duplicate words are: ");

        for (Map.Entry<String, Integer> itr : hMap.entrySet()){

            if(itr.getValue() > 1) {
                System.out.println(itr.getKey() + " appears: " + itr.getValue() + " times");
            }
        }

    }

    public static void main(String[] args) {

        String s = "Hey java is java best language is java";

        countDuplicateWordsString obj = new countDuplicateWordsString();
        obj.findDuplicateWords(s);


    }

}
