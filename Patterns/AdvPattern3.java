package Patterns;

public class AdvPattern3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){

            for (int j=1; j <= 5-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k <=i; k++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
