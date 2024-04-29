package Arrays;

import java.util.Arrays;

public class compareArrayElementsEqualOrNot {

    public void usingArraysClass(int a1[], int a2[]){

        if(Arrays.equals(a1,a2) == true){
            System.out.println("Arrays are EQUAL");
        } else {
            System.out.println("Arrays are NOT EQUAL");
        }
    }

    public void usingAlgo(int a1[], int a2[]){

        boolean Status = true;

        int a1Length = a1.length;

        int a2Length = a2.length;

        if(a1Length == a2Length){

            //Compare each array element
            for (int i=0; i < a1Length; i++){
                if(a1[i] != a2[i]){

                    Status = false;
                    break;
                }
            }

        } else {
            Status = false;
        }

        if(Status == false){
            System.out.println("Arrays are NOT EQUAL");
        } else {
            System.out.println("Arrays are EQUAL");
        }

    }

    public static void main(String[] args) {

        int a1[]= {1,2,3,4,5};
        int a2[]= {1,2,3,4,5,21};

        compareArrayElementsEqualOrNot obj = new compareArrayElementsEqualOrNot();
        //obj.usingArraysClass(a1,a2);
        obj.usingAlgo(a1,a2);
    }


}
