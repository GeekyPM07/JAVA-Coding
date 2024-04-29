/*

    ****
     ***
      **
       *

 */





package Patterns;

public class Pattern6 {

    public static void main(String[] args) {

        for(int i=0; i<4; i++){

            //For printing spaces
            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }

            //For printing stars
            for(int j=1+i; j <=4; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
