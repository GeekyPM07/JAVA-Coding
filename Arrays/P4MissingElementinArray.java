package Arrays;


//Elements need to in sorted order inside the array for this code to work.
public class P4MissingElementinArray {


    //ARRAY should be in sorted order for this approach to work.
    public void FindElement(int a[]){

        //traversing through array, and getting sum of all array elements.
        int sum1 = 0;
        for(int i=0; i < a.length; i++){
            sum1 = sum1 + a[i];
        }

        //Getting sum of all elements till the last element in the array
        int sum2 = 0;
        for(int j=30; j<=40; j++){
            sum2 = sum2 + j;
        }

        int misEl;

        //Subtracting to find the missing elements.
        misEl = sum2 - sum1;

        System.out.println("Missing element is: " +misEl);
    }


    public static void main(String args[]){

        P4MissingElementinArray obj = new P4MissingElementinArray();

        int arr[] = {30,31,32,34,35,36,37,38,39,40};


        //ARRAY should be in sorted order for this approach to work.
        obj.FindElement(arr);

    }
}
