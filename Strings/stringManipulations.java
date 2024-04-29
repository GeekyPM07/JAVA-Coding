package Strings;

public class stringManipulations {

    public static void main(String[] args) {

        String str = "The rains have started here.";

        String str1 = "  The rains Have started here.  ";

        System.out.println(str.indexOf('s')); //1st occurence of s

        System.out.println(str.indexOf('s', str.indexOf('s')+1)); //2nd occurence of s

        System.out.println(str.substring(0,5));
        System.out.println(str.substring(5));

        System.out.println(str1.trim());


        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        //IMP

        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));

    }

}
