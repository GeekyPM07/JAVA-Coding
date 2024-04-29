package Patterns;

public class Pattern4 {

    /*

     ****
     ***
     **
     *

     */


    public static void main(String[] args) {

        //Traversing Rows
        for (int i = 0; i < 4; i++) {
            //Traversing Columns - printing stars
            for (int j=1; j<=4-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
