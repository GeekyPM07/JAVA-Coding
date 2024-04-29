package Arrays;

public class secondLastElementArray {

    int arr[] = new int[5];

    secondLastElementArray(){
        arr[0] = 25;
        arr[1] = 128;
        arr[2] = 3;
        arr[3] = 256;
        arr[4] = 12;
    }

    public void getSecondLastElement(){

        int lastElement = arr[0];
        int secondLastElement = arr[0];

        for(int i=0; i < arr.length; i++){

            if(i == arr.length-1){
                lastElement = arr[i];
            }

            if(i == arr.length-2){
                secondLastElement = arr[i];
            }
        }

        System.out.println("Second Last element: " +secondLastElement);
    }

    public static void main(String[] args) {

        secondLastElementArray obj = new secondLastElementArray();
        obj.getSecondLastElement();

    }
}
