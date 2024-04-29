package Concepts.Interface;

public class ChromiumDriver extends RemoteWebDriver{

    public void cdMethod1(){

    }

    public void cdMethod2(){

    }

    public static void main(String[] args) {

        ChromiumDriver cd = new ChromiumDriver();
        cd.IMethod1();
        cd.IMethod2();
        cd.IMethod3();
        cd.rwdMethod1();
        cd.rwdMethod2();
        cd.cdMethod1();
        cd.cdMethod2();

    }
}
