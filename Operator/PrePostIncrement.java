package Operator;

public class PrePostIncrement {

    public void preIncrement(int b){
        System.out.println("Pre increment -> increment first -- happens in same line");

        System.out.println(++b);
        System.out.println(b);
    }

    public void postIncrement(int a){

        System.out.println("Post increment -> increment happens in the next line.");

        System.out.println(a++);
        System.out.println(a);
    }

    public void calcExpression(int a){

        System.out.println("exp1:");
        System.out.println(++a+a++);
        System.out.println("value of a after exp1:");
        System.out.println(a);

    }

    public void calcExpression2(int a){

        System.out.println("exp2:");
        System.out.println(a++-++a);
        System.out.println("value of a after exp2:");
        System.out.println(a);

    }

    public void calcExpression3(double x, double y, double z){
        System.out.println("exp3:");
        double result = Math.cbrt((Math.pow(x, 2) + Math.pow(y, 2)) - Math.abs(z));
        System.out.println(result);
    }

    public void check(String s){

        System.out.println(s.substring(3,7));

    }


    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        PrePostIncrement obj = new PrePostIncrement();
        obj.postIncrement(a);
        obj.preIncrement(b);
        obj.calcExpression(a);
        obj.calcExpression2(a);

        double x = 83.0;
        double y = 62.0;
        double z = 2.0;

        obj.calcExpression3(x,y,z);

        obj.check("helloworld");

    }
}
