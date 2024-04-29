package Concepts.HierarchicalInheritance;

public class Car extends Vehicle {

    Car(String vehicleNamefromConstructor, String vehicleTypeFromConstructor, int noOfTyresFromConstructor){
        //initializing parent class properties
        this.vehicleName = vehicleNamefromConstructor;
        this.vehicleType = vehicleTypeFromConstructor;
        this.noOfTyres = noOfTyresFromConstructor;
    }

    //over-riding parent class methods
    @Override
    public void maxSpeed() {
        System.out.println("Max speed of Car is : 180kmph");
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", noOfTyres=" + noOfTyres +
                '}';
    }

    public static void main(String[] args) {
        Car obj = new Car("Maruti", "Car", 4);
        System.out.println(obj);
        obj.maxSpeed();
    }
}
