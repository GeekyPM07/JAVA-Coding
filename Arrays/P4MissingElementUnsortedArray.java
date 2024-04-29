package Arrays;

public class P4MissingElementUnsortedArray {

    public void findMissingElement(int arr[]){

        int temp = 0;
        int firstElement = 0;
        int lastElement = 0;
        int sumOfArrayElements = 0;
        int sumWithAllElements = 0;
        //Sorting Array in ascending order

        //i for number of Rounds
        for(int i=0; i < arr.length; i++){
            //j for Comparing and Swapping elements
            for (int j=1; j < arr.length; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Printing Sorted Array and getting SUM of Sorted Array elements.

        for(int i=0; i < arr.length; i++){

            if(i == 0){
                firstElement = arr[i];
            }

            if(i == arr.length-1){
                lastElement = arr[i];
            }

            sumOfArrayElements = sumOfArrayElements + arr[i];

            System.out.print(arr[i] + " ");

        }

        System.out.println();

        //Finding missing element

        for(int i = firstElement; i <= lastElement; i++){
            sumWithAllElements = sumWithAllElements + i;
        }

        int missingElement = sumWithAllElements - sumOfArrayElements;

        System.out.println("Missing element is: " +missingElement);
    }


    public static void main(String[] args) {

        int arr[] = {32,34,30,31,35,36,40,39,38,37};

        P4MissingElementUnsortedArray obj = new P4MissingElementUnsortedArray();
        obj.findMissingElement(arr);

    }
}
