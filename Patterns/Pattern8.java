package Patterns;

/*
        12345
        1234
        123
        12
        1

*/

public class Pattern8 {

    public static void main(String[] args) {

        //Traversing Rows
        for (int i = 0; i < 5; i++) {

            for(int j=1; j <= 5-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
