package Concepts.Polymorphism;

public class CompileTimePolymorphism {

    String car = "Jimny";
    String destination = "Ladakh";
    int noOfTravellers = 3;

    public void Method1(String car, String destination, int noOfTravellers ){

        System.out.println("inside method 1");

    }

    public void Method1(String destination, int noOfTravellers, String car ){

        System.out.println("inside overloaded method 1");

    }

    public void Method1(String s){

        System.out.println("inside string overloaded method of parent class");

    }

    public void Method1(int x){

        System.out.println("inside integer overloaded method of parent class");

    }


    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.Method1("Toyota", "Bangalore", 2);
        obj.Method1("Bangalore", 2, "Honda");
        obj.Method1("Some String");
        obj.Method1(10);

    }
}


