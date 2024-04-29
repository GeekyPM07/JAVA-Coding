package Strings;

public class P2_2GetJunkFromString {

    public String GetJunk(String s){

        //Remove all characters from -- a-zA-Z0-9 and return JUNK Characters
        s = s.replaceAll("[a-zA-Z0-9]","");

        System.out.println(s);

        return s;

    }

    public static void main(String args[]) {

        P2_2GetJunkFromString obj = new P2_2GetJunkFromString();
        obj.GetJunk("This#string%contains^special*characters&.");
        obj.GetJunk("Hello+-^Java+ -Programmer^ ^^-- ^^^ +!");

    }
}
