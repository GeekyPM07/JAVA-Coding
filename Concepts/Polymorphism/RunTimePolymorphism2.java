package Concepts.Polymorphism;

public class RunTimePolymorphism2 extends RunTimePolymorphism {

    RunTimePolymorphism2(String carFromConstructor, String tyreFromConstructor) {
        this.car = carFromConstructor;
        this.tyres= tyreFromConstructor;
    }

    //Method Over-riding
    @Override
    public void getCarName() {
        System.out.println(this.car);
    }

    //Method Over-riding
    @Override
    public void getTyreName() {
        System.out.println(this.tyres);
    }

    @Override
    public String toString() {
        return "RunTimePolymorphism2{" +
                "car='" + car + '\'' +
                ", tyres='" + tyres + '\'' +
                '}';
    }

    public static void main(String[] args) {

        RunTimePolymorphism2 obj = new RunTimePolymorphism2("Thar", "potenza");
        obj.getCarName();
        obj.getTyreName();

    }

}
