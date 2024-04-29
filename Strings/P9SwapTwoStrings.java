package Strings;

public class P9SwapTwoStrings {

    String a = "Dear";
    String b = "Pratt";


    public void swapWithoutThirdVariable(){

        System.out.println("Before swapping: ");
        System.out.println(a);
        System.out.println(b);

        //1. Concatenate a & b
        a = a+b;

        //2. Store string a in string b
        b = a.substring(0,a.length()-b.length());

        //3. Store string b in string a
        a = a.substring(b.length());

        System.out.println("After swapping: ");
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String args[]){

        P9SwapTwoStrings obj = new P9SwapTwoStrings();
        obj.swapWithoutThirdVariable();
    }
}
