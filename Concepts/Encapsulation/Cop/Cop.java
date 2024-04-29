package Concepts.Encapsulation.Cop;

/* Encapsulation refers to the practice of keeping variables,methods inside a UNIT i.e Class by using the concept of Data HIDING
   The instance variables should be using Acess Modifiers i.e protected, private if set as PRIVATE, and can be accessed by getter/setter methods.
 */


public class Cop {

    //protected -- access limited to classes within the package, outside package class can access if they are child class.
    protected String gun;

    protected Cop(String gun){
        this.gun = gun;
    }

    protected String getGun(){
        return gun;
    }

    protected void canIShoot(){
        System.out.println("Yes cops/police can shoot.");
    }

    public static void main(String[] args) {
        Cop cop = new Cop("AK47");
        System.out.println(cop.getGun());
        cop.canIShoot();
    }
}
