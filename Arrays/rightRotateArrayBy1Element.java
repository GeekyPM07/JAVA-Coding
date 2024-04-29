package Arrays;

import java.util.Arrays;

public class rightRotateArrayBy1Element {


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,7,9,10};

        int lastEl = arr[arr.length-1];

        for(int i = arr.length-2; i>=0; i--){

            arr[i+1] = arr[i];

            if(i == 0){
                arr[i] = lastEl;
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
