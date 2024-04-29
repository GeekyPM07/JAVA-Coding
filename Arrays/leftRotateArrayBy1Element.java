package Arrays;

import java.util.Arrays;

public class leftRotateArrayBy1Element {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5, 7,9, 10};

        int firstEl = arr[0];

        for(int i=1; i < arr.length; i++){

            arr[i-1] = arr[i];

            if(i == arr.length-1){

                arr[i] = firstEl;

            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
