package Patterns;

/*

    *
   **
  ***
 ****

 */

public class Pattern5 {

    public static void main(String[] args) {

        //Traversing Rows
        for (int i = 1; i <= 4; i++) {

            //Traversing Columns
            for(int j=0; j < 4-i; j++){
                System.out.print(" ");
            }

            //Traversing Columns
            for(int k=1; k <=i; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
