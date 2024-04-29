package Strings;

public class removeWhiteSpaces {

    public static void main(String[] args) {

        String str = "A B C  D";

        String str2 = str.replaceAll("\\s", "");

        String str3 = str.replaceAll(" ", "");

        System.out.println(str2);

        System.out.println(str3);

    }

}
