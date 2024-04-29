package Concepts.MultiLevelInheritance;

public class Car extends Vehicle{

    String EngineType;
    String EngineCapacity;

    Car(){

        this.vehicleName = "Maruti Jimny";
        this.vehicleType = "SUV";
        this.noOfTyres = 4;

    }

    //over-riding parent class methods
    @Override
    public void maxSpeed() {
        System.out.println("Max speed of Car is : 180kmph");
    }


    @Override
    public String toString() {
        return "Car{" +
                "EngineType='" + EngineType + '\'' +
                ", EngineCapacity='" + EngineCapacity + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", noOfTyres=" + noOfTyres +
                '}';
    }

    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj);
//        obj.maxSpeed();
//        obj.maxTorqueMethod();
    }
}
