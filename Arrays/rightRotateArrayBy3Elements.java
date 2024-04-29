package Arrays;

import java.util.Arrays;

public class rightRotateArrayBy3Elements {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,7,9,10};
        int n = 3;

        //Loop to RIGHT rotate array by 3 elements
        for(int j = 0; j < n; j++){

            //Logic to RIGHT rotate array by 1 element
            int lastEl = arr[arr.length-1];

            for(int i = arr.length-2; i>=0; i--){

                arr[i+1] = arr[i];

                if(i == 0){
                    arr[i] = lastEl;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
