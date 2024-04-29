package Arrays;

public class sortArrayBubbleSort {

    public void bubbleSort(int arr[]){

        int length = arr.length;
        int temp = 0;

        for(int i=0; i < length; i++){
            for(int j=1; j < length; j++){

                if(arr[j-1] > arr[j]){

                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }

            }
        }

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 1, 4, 3, 1};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Array after Bubble Sort");
        sortArrayBubbleSort obj = new sortArrayBubbleSort();
        obj.bubbleSort(arr);


    }
}
