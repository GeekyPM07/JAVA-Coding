package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class findDuplElementsArrayUsingHashSet {

    public void findDuplicateElements(int a[]){


        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i=0; i < a.length; i++){

            if(lhs.add(a[i]) == false){

                if(al.contains(a[i])){

                } else {
                    al.add(a[i]);
                }
            }
        }

        System.out.println(al);
    }


    public static void main(String[] args) {

        int arr[] = {3,4,5,3,6,4,3,4};
        findDuplElementsArrayUsingHashSet obj = new findDuplElementsArrayUsingHashSet();
        obj.findDuplicateElements(arr);

    }

}
