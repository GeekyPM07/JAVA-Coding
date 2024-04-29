package Concepts.Interface;

public class MainClass {

    public static void main(String[] args) {

        //WebCasting


        //Parent interface ref v pointing to child class OBJECT
        WebDriver obj = new ChromeDriver();

        //Only Parent Interface methods will be available to child class object
        obj.IMethod1();
        obj.IMethod2();
        obj.IMethod3();
        obj.quitMethod();
        obj.closeMethod();

        WebDriver obj2 = new FireFoxDriver();
        obj2.IMethod1();
        obj2.IMethod2();
        obj2.IMethod3();
        obj2.quitMethod();
        obj2.closeMethod();


    }

}
