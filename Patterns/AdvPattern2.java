package Patterns;

public class AdvPattern2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k <=5; k++){
                    System.out.print("*");
            }

            for(int l=1; l <= i; l++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
