package Concepts.Exception;

public class ArithmaticExc {

    public static void main(String[] args) {

        int a = 10, b = 0, c;

        try{
            c = a/b;

            //Below line wont execute due to execption.
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("Main method ended.");

    }


}
