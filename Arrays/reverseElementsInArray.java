package Arrays;

import java.util.Arrays;

public class reverseElementsInArray {

    public void usingSwapping(int arr[]){

        int startIndex = 0;
        int endIndex = arr.length-1;
        int temp = 0;


        while (startIndex < endIndex){

            temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;

        }

        System.out.println("Reversed string is: " + Arrays.toString(arr));

    }


    public static void main(String[] args) {

        int arr[] = {5,1,2,3,4};

        reverseElementsInArray obj = new reverseElementsInArray();
        obj.usingSwapping(arr);


    }
}
