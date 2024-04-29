package Concepts.Interface;

public class FireFoxDriver extends RemoteWebDriver {

    @Override
    public void quitMethod() {
        System.out.println("Implementing quit method for firefox");
    }

    @Override
    public void closeMethod() {
        System.out.println("Implementing close method for firefox");
    }

}
