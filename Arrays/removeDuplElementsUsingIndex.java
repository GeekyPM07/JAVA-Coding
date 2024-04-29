package Arrays;

public class removeDuplElementsUsingIndex {

    public void removeDuplicateElementsUsingIndex(int arr[]){

        int temp[] = new int[arr.length];

        for(int i=0; i < arr.length-1; i++){

            if(arr[i] != arr[i+1]){

                temp[i] = arr[i];

            } else {

            }
        }

        for(int k=0; k < temp.length; k++){
            System.out.print(temp[k] + " ");
        }

    }

    public static void main(String[] args) {


        int arr[] = {3,4,4,5,5,6,7,9,9};
        removeDuplElementsUsingIndex obj = new removeDuplElementsUsingIndex();
        obj.removeDuplicateElementsUsingIndex(arr);

    }

}
