package Strings;

public class P1RevString {

    String s1 = "i love programming very much";

    public String revString(String s){

        int StringLength = s.length();

        String s1 = "";

        for(int i=s.length()-1; i>=0; i--){
            s1 = s1 + s.charAt(i);
        }

        return s1;
    }

    public static void main(String args[]){

        P1RevString obj = new P1RevString();

        System.out.println(obj.revString("Appium"));

        //Reverse String using StringBuffer class
        StringBuffer sb1 = new StringBuffer(obj.s1);
        System.out.println(sb1.reverse());
    }
}
