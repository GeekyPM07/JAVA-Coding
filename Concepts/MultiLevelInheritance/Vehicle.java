package Concepts.MultiLevelInheritance;

public class Vehicle {

    String vehicleName;
    String vehicleType;
    int noOfTyres;

    public void maxSpeed(){
        System.out.println("Inside Vehicle class maxSpeed method");
    }

    public void maxTorqueMethod(){
        System.out.println("Inside Vehicle class maxTorque method");
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", noOfTyres=" + noOfTyres +
                '}';
    }

    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        System.out.println(obj);
        obj.maxSpeed();
        obj.maxTorqueMethod();

    }

}
