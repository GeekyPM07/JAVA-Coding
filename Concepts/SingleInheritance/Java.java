package Concepts.SingleInheritance;

public class Java extends ProgrammingLanguage {

    String newFeature;

    public Java(int version, String author, String newFeatureFromConstructor ) {

        //Parent class attributes -- version, author are available from parent class and we are calling parent class constructor to get values initialized.
        // Values will be initialized for the Parent Class Object, however since child class extends parent class, same values will be present here.
        super(version, author);
        this.newFeature = newFeatureFromConstructor;
    }

    //Child class method overrides Parent class method.
    @Override
    public void Car(){

        //super.Car();
        System.out.println("Volkswagen");
    }

    @Override
    public String toString() {
        return "Java{" +
                "newFeature='" + newFeature + '\'' +
                ", version=" + version +
                ", author='" + author + '\'' +
                '}';
    }
}
