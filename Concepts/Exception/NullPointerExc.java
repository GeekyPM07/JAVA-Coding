package Concepts.Exception;

public class NullPointerExc {

    public static void main(String[] args) {

        String s = null;

        String upCase = "";
        try {

           upCase  = s.toUpperCase();
        }

        catch (NullPointerException ne){

            System.out.println(upCase);

            System.out.println("cant convert null string to upper case");

        }

        System.out.println("main method ended");

    }

}
