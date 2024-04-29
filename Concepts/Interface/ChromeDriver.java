package Concepts.Interface;

public class ChromeDriver extends ChromiumDriver {

    public void chromeDriverMethod1(){

    }

    public void chromeDriverMethod2(){

    }

    @Override
    public void quitMethod() {
        System.out.println("Implementing quit method for chrome");
    }

    @Override
    public void closeMethod() {
        System.out.println("Implementing close method for chrome");
    }

    public static void main(String[] args) {

        ChromeDriver chromeD = new ChromeDriver();
        chromeD.IMethod1();
        chromeD.IMethod2();
        chromeD.IMethod3();
        chromeD.rwdMethod1();
        chromeD.rwdMethod2();
        chromeD.cdMethod1();
        chromeD.cdMethod2();
        chromeD.chromeDriverMethod1();
        chromeD.chromeDriverMethod2();

    }
}
