package Patterns;

/*

 *
 **
 ***
 ****

 */


public class Pattern3 {

    public static void main(String[] args) {

        //Traversing Rows
        for (int i = 1; i <= 4; i++) {
            //Traversing Columns - printing stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
