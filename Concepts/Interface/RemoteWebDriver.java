package Concepts.Interface;

public class RemoteWebDriver implements WebDriver{

    @Override
    public void IMethod1() {
        System.out.println("Implemented WebDriver Interface Method 1");
    }

    @Override
    public void IMethod2() {
        System.out.println("Implemented WebDriver Interface Method 2");
    }

    @Override
    public void IMethod3() {
        System.out.println("Implemented WebDriver Interface Method 3");
    }

    @Override
    public void quitMethod() {

    }

    @Override
    public void closeMethod() {

    }

    public void rwdMethod1(){

    }

    public void rwdMethod2(){

    }

    public static void main(String[] args) {

        RemoteWebDriver rw = new RemoteWebDriver();
        rw.IMethod1();
        rw.IMethod2();
        rw.IMethod3();
        rw.rwdMethod1();
        rw.rwdMethod2();

    }


}
