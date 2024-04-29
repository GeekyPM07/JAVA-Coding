package Strings;

public class P2_1RemoveJunkFromString {

    public String RemoveJunk(String s){

        //Remove all characters apart from -- a-zA-Z0-9
        s = s.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(s);

        return s;

    }

    public static void main(String args[]) {

        P2_1RemoveJunkFromString obj = new P2_1RemoveJunkFromString();
        obj.RemoveJunk("This#string%contains^special*characters&.");
        obj.RemoveJunk("Hello+-^Java+ -Programmer^ ^^-- ^^^ +!");
    }
}
