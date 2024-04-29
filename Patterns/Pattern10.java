package Patterns;

/*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

*/



public class Pattern10 {

    public static void main(String[] args) {

        int k=0;
        //Traversing Rows
        for (int i = 1; i <= 5; i++) {
            for(int j=1; j <=i ; j++){
                if(i == 1 && j == 1 || i == 3 && j == 1 || i == 5 && j ==1){

                    k = 1;
                    System.out.print(k + " ");

                } else if (i == 2 && j == 1 || i == 4 && j ==1) {
                    k = 0;
                    System.out.print(k + " ");
                } else {
                    if(k==0){
                        k=1;
                        System.out.print(k + " ");
                    } else if (k==1){
                        k=0;
                        System.out.print(k + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
