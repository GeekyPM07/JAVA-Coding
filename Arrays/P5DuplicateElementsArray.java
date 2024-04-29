package Arrays;

import java.util.*;

public class P5DuplicateElementsArray {

    String strArray[] = new String[] {"Java","C", "Python", "Ruby", "Java"};

    public void usingBruteForceMethod(){

        for(int i =0; i < strArray.length; i++){
            for(int j=i+1; j < strArray.length; j++){
                if(strArray[i].equals(strArray[j])){
                    System.out.println("Duplicate element is: " + strArray[i]);
                    break;
                }
            }
        }
    }


    public void UsingHashSet(){

        /*
            Set is an interface, HashSet is a class which implements Set interface's methods

            In HashSet : All Objects are unique.

         */

        Set<String> hSet = new HashSet<String>();

        for(String el : strArray){

            //If duplicate element found, it wont add in hashSet Object
            if(hSet.add(el) == false){
                System.out.println("Duplicate element is: " + el);
            } else {
                hSet.add(el);
            }
        }

    }


    public void UsingHashMap(){

        /*
             Map is an Interface, HashMap is a class which implements Map interface

         */

        Map<String, Integer> mapObj = new HashMap<String, Integer>();

        for(int i=0; i < strArray.length; i++){

            if(mapObj.containsKey(strArray[i])){
                mapObj.put(strArray[i], mapObj.get(strArray[i])+1);
            } else {
                mapObj.put(strArray[i], 1);
            }
        }

        for(String element: mapObj.keySet()){

            if(mapObj.get(element) >= 2){
                System.out.println("Duplicate elements are: " +element);
            }
        }
    }



    public static void main(String args[]){

        P5DuplicateElementsArray obj = new P5DuplicateElementsArray();

//        obj.usingBruteForceMethod();
//
//        obj.UsingHashSet();

        obj.UsingHashMap(); //Couldn't complete.

    }
}
