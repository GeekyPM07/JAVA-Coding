package Concepts.Polymorphism;

public class RunTimePolymorphism {

    String car;
    String tyres;

    RunTimePolymorphism(){

    }

    //OverloadedConstructor
    RunTimePolymorphism(String carFromConstructor, String tyreFromConstructor){

        this.car = carFromConstructor;
        this.tyres = tyreFromConstructor;

    }

    public void getCarName(){
        System.out.println(car);
    }

    public void getTyreName(){
        System.out.println(tyres);
    }


    @Override
    public String toString() {
        return "RunTimePolymorphism{" +
                "car='" + car + '\'' +
                ", tyres='" + tyres + '\'' +
                '}';
    }

    public static void main(String[] args) {

        RunTimePolymorphism obj = new RunTimePolymorphism("Jimny", "MRF");
        obj.getCarName();
        obj.getTyreName();

    }
}
