package Arrays;

public class findDuplElementsArrayUsingIndex {

    public void findDuplicateElements(int arr[]){

        boolean duplFound =  false;

        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    duplFound = true;
                    System.out.println("Duplicate element is: " +arr[i]);

                }
            }
        }

        if(duplFound == false){
            System.out.println("No Duplicate element found");
        }
    }

    public static void main(String[] args) {

        int arr[] = {3,4,5,3,6,4,3,4};
        findDuplElementsArrayUsingIndex obj = new findDuplElementsArrayUsingIndex();
        obj.findDuplicateElements(arr);

    }


}
