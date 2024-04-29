package Concepts;

public class StringEqualsUnderstanding {

    //String object is being created inside String Pool inside HeapMemory inside JVM - 1 String Object s0
    String s0= "Prateek";

    //s1 ref variable pointing to already created String object s0 inside String Pool inside HeapMemory inside JVM
    String s1 = "Prateek";

    //String created inside HeapMemory inside JVM  - 1 String Object s2
    String s2 = new String("Prateek");

    //String created inside HeapMemory inside JVM  - 1 String Object s3
    String s3 = new String("Prateek");


    public static void main(String[] args) {

        StringEqualsUnderstanding obj = new StringEqualsUnderstanding();
        // == is used to compare the references i.e where the strings are created? Whether in string pool or in Heap ?
        System.out.println("== gives: ");

        System.out.print("Comparing 2 reference variables of same 1 string object inside String Pool: ");
        System.out.println(obj.s0 == obj.s1);

        System.out.print("Comparing 1 string object inside String Pool and 1 string object in heapMemory: ");
        System.out.println(obj.s1 == obj.s2);

        System.out.print("Comparing two string objects in heapMemory: ");
        System.out.println(obj.s2 == obj.s3);

        System.out.println("");

        //.equals checks whether the created String objects's contents are same or not.
        System.out.println(".equals gives: ");

        System.out.print("Comparing 2 reference variables of same 1 string object inside String Pool: ");
        System.out.println(obj.s0.equals(obj.s1));

        System.out.print("Comparing 1 string object inside String Pool and 1 string object in heapMemory: ");
        System.out.println(obj.s1.equals(obj.s2));

        System.out.print("Comparing two string objects in heapMemory: ");
        System.out.println(obj.s2.equals(obj.s3));

        System.out.println("");

        //.compareTo compares string lexicographically 1 by 1; gives 0 when strings are true.
        System.out.print(".compareTo gives: ");
        System.out.println(obj.s1.compareTo(obj.s2));




    }


}
