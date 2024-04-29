package Concepts.HierarchicalInheritance;

public class Bike extends Vehicle {

    Bike(String vehicleNamefromConstructor, String vehicleTypeFromConstructor, int noOfTyresFromConstructor){
        //initializing parent class properties
        this.vehicleName = vehicleNamefromConstructor;
        this.vehicleType = vehicleTypeFromConstructor;
        this.noOfTyres = noOfTyresFromConstructor;
    }

    //over-riding parent class methods
    @Override
    public void maxSpeed() {
        System.out.println("Max speed of Bike is : 120kmph");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", noOfTyres=" + noOfTyres +
                '}';
    }

    public static void main(String[] args) {
        Bike obj = new Bike("Suzuki", "Bike", 2);
        System.out.println(obj);
        obj.maxSpeed();

    }
}
