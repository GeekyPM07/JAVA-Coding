package Strings;

import java.util.ArrayList;

public class javaSubstringsComparisonHackerRank {

    public static String getSmallestAndLargestUsingArrayList(String s, int k) {

        ArrayList<String> al = new ArrayList<String>();

        for(int i=0; i<s.length(); i++){

            if(i+k > s.length()){
                break;
            }else {
                System.out.println(s.substring(i, i+k));
                al.add(s.substring(i, i+k));
            }
        }

        String smallest = al.get(0);
        String largest = al.get(0);

        for(String element: al){

            if(element.compareTo(smallest) < 0){
                smallest = element;
            } else if (element.compareTo(largest) > 0){
                largest = element;
            }
        }

        System.out.println("Smallest lexicographical string is: " +smallest);
        System.out.println("Largest lexicographical string is: " +largest);

        return smallest + "\n" + largest;

    }



    public static void main(String[] args) {

        String s = "welcometojava";

        int k = 3;

        getSmallestAndLargestUsingArrayList(s,k);

    }
}
