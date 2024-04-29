package Concepts.Polymorphism;

public class CompileTimePolymorphism2 extends CompileTimePolymorphism{

    public void Method1(char x){

        System.out.println("Inside overloaded method of child class");

    }

    public static void main(String[] args) {

        CompileTimePolymorphism2 obj2 = new CompileTimePolymorphism2();
        obj2.Method1('a');//Child Overloaded Method
        obj2.Method1(20);//Parent
        obj2.Method1("hello");//Parent

        /*
            When Creating the ref V of parent class and Object of child class - Methods available to the child class objects
            are only of parent class not child class’s methods.

         */

        CompileTimePolymorphism obj3 = new CompileTimePolymorphism2();
        obj3.Method1("string", "string", 20);//Parent
        obj3.Method1(25);//Parent
        obj3.Method1("Hello");//Parent
        obj3.Method1("string", 20, "yellow");//Parent
        obj3.car = "somecar"; //Parent
        obj3.destination = "somedestination"; //Parent
        obj3.noOfTravellers = 30; //Parent

    }
}
