package Concepts;

/* Constructor is used to initialize Objects, Values of objects.
 *
 */

public class constructorUnderstanding {


    //Assign values directly - this will be returned by obj.age, obj.colour if values not initialized by Constructor
    int age = 20;
    String colour = "black";

    //Assign values by using Non param, default constructor
    constructorUnderstanding(){
        age = 40;
        colour = "Red";
    }

    //Assign values by using Parameterized constructor
    constructorUnderstanding(int ageFromConstructor, String colourFromConstructor){

        //this keyword used to refer to current object. i.e this is pointing to Obj2

        this.age = ageFromConstructor;
        this.colour = colourFromConstructor;

    }


    //Copy Constructor
    public constructorUnderstanding(constructorUnderstanding obj2) {

        //this keyword used to refer to current object. i.e this is pointing to Obj3
        //assigning obj2 age, colour to obj3

        this.age = obj2.age;
        this.colour = obj2.colour;

    }

    public static void main(String[] args) {

        constructorUnderstanding obj = new constructorUnderstanding();
        System.out.println(obj.age);
        System.out.println(obj.colour);

        constructorUnderstanding obj2 = new constructorUnderstanding(35,"Brown");
        System.out.println(obj2.age);
        System.out.println(obj2.colour);

        //Assigning obj2's info to obj3
        constructorUnderstanding obj3 = new constructorUnderstanding(obj2);
        System.out.println(obj3.age);
        System.out.println(obj3.colour);

    }


}
