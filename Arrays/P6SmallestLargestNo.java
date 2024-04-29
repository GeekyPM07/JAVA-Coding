package Arrays;

public class P6SmallestLargestNo {

    int intArray[] = new int[] {8,1,5,9,12,33,23,7,4,3};


    //Initialise largest & smallest numbers at first place.
    int smallest = intArray[0];
    int largest = intArray[0];

    public void findSmallestLargestElement(){

        for(int i=0; i < intArray.length; i++){

                if(intArray[i] < smallest){
                    smallest = intArray[i];
                } else if(intArray[i] > largest) {
                    largest = intArray[i];
                }
            }

        System.out.println("Smallest element in Array is: " +smallest);

        System.out.println("Largest element in Array is: " +largest);

        }

    public static void main(String args[]){

        P6SmallestLargestNo obj = new P6SmallestLargestNo();
        obj.findSmallestLargestElement();

    }
}
