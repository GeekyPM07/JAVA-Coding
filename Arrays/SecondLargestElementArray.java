package Arrays;

import java.util.Arrays;
import java.util.List;

public class SecondLargestElementArray {

    int arr[] = new int[5];

    SecondLargestElementArray(){

        //Descending order sorted array

       /*

        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;

        */


        //Unsorted Array
        arr[0] = 25;
        arr[1] = 128;
        arr[2] = 3;
        arr[3] = 256;
        arr[4] = 12;

    }

    public void secondLargestWithoutSorting(){

        int largest = arr[0];
        int secondLargest = arr[0];

        //1. Iterate the array
        for(int i=0; i < arr.length; i++){

            //2. Check if the number @ array index is greater than Largest Number.
            if(arr[i] > largest){
                //2.a. if element @ a[i] is Largest then move the largest element to secondLargest
                secondLargest = largest;
                //2.b Assign element @ a[i] to largest
                largest = arr[i];

            }
            //3. Check if @ a[i] element is smaller than largest and greater than secondLargest
            else if(arr[i] < largest && arr[i] > secondLargest){
                //3.b Assign element @ a[i] to secondLargest
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest element is: " +largest);
        System.out.println("Second Largest element is: " +secondLargest);

    }

    public void getSecondLargestUsingSorting(){

        int temp = 0;


        // Sorting the array elements in descending order
        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){

                if(arr[j] > arr[i]){
                    temp = arr[j];
                    arr[j]= arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Array elements in Descending Sorted order are: ");

        for(int i: arr){
            System.out.print(i + " ");
        }

        System.out.println("Largest element is: " + arr[0]);
        System.out.println("Second largest element is: " + arr[1]);
    }

    public void getsecondLargestElementUsingArraysClass(){

        //Sorts array in ascending order
        Arrays.sort(arr);

        for(int i: arr){
            System.out.print(i + " ");
        }

        System.out.println("Largest element is: " + arr[arr.length-1]);
        System.out.println("Second largest element is: " + arr[arr.length-2]);
    }

    public static void main(String[] args) {

        SecondLargestElementArray obj = new SecondLargestElementArray();
        obj.getsecondLargestElementUsingArraysClass();
        obj.secondLargestWithoutSorting();
        obj.getSecondLargestUsingSorting();

    }
}
