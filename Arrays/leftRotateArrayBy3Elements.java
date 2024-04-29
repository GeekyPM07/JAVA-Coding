package Arrays;

import java.util.Arrays;

public class leftRotateArrayBy3Elements {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 7, 9, 10};

        int n = 3;

        //Loop to LEFT rotate array by 3 elements
        for (int j = 0; j < n; j++) {

            //Logic to LEFT rotate array by 1 element
            int firstEl = arr[0];

            for (int i = 1; i < arr.length; i++) {

                arr[i - 1] = arr[i];

                if (i == arr.length - 1) {

                    arr[i] = firstEl;

                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
