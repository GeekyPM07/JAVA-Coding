package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class removeDuplicateElementsArrayUsingHashset {


    public void removeDuplicatesUsingHashSet(int arr[]){

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        for(int i=0; i < arr.length; i++){

            lhs.add(arr[i]);

        }

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i: lhs){
            al.add(i);
        }

        System.out.print(al.toString());

    }


    public static void main(String[] args) {


        int arr[] = {3,4,4,5,5,5,6,7,9,9};

        removeDuplicateElementsArrayUsingHashset obj = new removeDuplicateElementsArrayUsingHashset();
        obj.removeDuplicatesUsingHashSet(arr);
    }
}
