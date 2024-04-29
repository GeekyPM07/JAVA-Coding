package Patterns;

/*

 *****
 *   *
 *   *
 *****

 */


public class hollowRectangle {

    public static void main(String[] args) {

        //Traversing Rows
        for (int i = 1; i <= 4; i++) {

            if (i == 1 || i == 4) {

                //Traversing columns - printing stars
                for (int j = 1; j <= 4; j++) {
                    System.out.print("*");
                }
            } else {
                //Traversing columns - printing stars & spaces
                for (int k = 1; k <= 4; k++) {
                    if(k==1 || k==4){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}