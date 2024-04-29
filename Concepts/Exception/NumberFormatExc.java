package Concepts.Exception;

public class NumberFormatExc {

    public static void main(String[] args) {

        String s = "Pratt";
        String s1 = "123";

        try {
            int a = Integer.parseInt(s);

            System.out.println(a);

        }
        catch (ArithmeticException ae){

            System.out.println("Wrong exception caught! program will terminate before this block");

        }

//        catch (NumberFormatException nfe){
//
//            System.out.println("String: " + s1 + " cannot be converted to integer ");
//
//        }


        System.out.println("Main method ended");

    }






}
