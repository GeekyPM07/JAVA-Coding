package Concepts;

public class finalKeyword {

    public final int x;

    finalKeyword(){

        this.x = 25;

    }

    public static void main(String[] args) {

        finalKeyword obj = new finalKeyword();

        System.out.println(obj.x);

    }
}
