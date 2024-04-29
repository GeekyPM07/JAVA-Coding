package Concepts.MultiLevelInheritance;

public class Engine extends Car{

        Engine(){

            this.EngineType = "V8";
            this.EngineCapacity = "4L";

        }

        @Override
        public void maxTorqueMethod(){
            System.out.println("Max torque from the Engine of the Car is : 420nm");
        }


    @Override
    public String toString() {
        return "Engine{" +
                "EngineType='" + EngineType + '\'' +
                ", EngineCapacity='" + EngineCapacity + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", noOfTyres=" + noOfTyres +
                '}';
    }

    public static void main(String[] args) {
        Engine obj = new Engine();
        System.out.println(obj);
        obj.maxSpeed();
        obj.maxTorqueMethod();
    }
}
