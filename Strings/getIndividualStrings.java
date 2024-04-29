package Strings;

public class getIndividualStrings {

    public static void main(String[] args) {

        String str = "Java, Maven, TestNG, Jenkins";

        String str1 = "XYZ";
        String str2 = "ABC";
        String str3 = "DEF";

        String arr[] = str.split(",");

        for(int i=0; i < arr.length; i++){

            System.out.println(arr[i]);

        }

        System.out.println((str1.concat(str2)).concat(str3));

    }
}
