package Patterns;

/*

*****
*****
*****
*****

*/


public class solidRectangle {

    public static void main(String[] args) {

        int row = 4;
        int column = 5;

        for(row = 0; row < 4; row++){
            for(column = 0; column < 5; column++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
