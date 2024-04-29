package Patterns;

/*

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5


 */



public class AdvPattern4 {

    public static void main(String[] args) {

        for(int i=1; i <=5; i++){

            for(int j=1; j <= 5-i; j++){
                System.out.print(" ");
            }

            for(int j=i; j >= 1; j--){
                System.out.print(j);
            }

            for(int l=1; l < i; l++){
                System.out.print(l+1);
            }

            System.out.println();
        }
    }
}
