package MathProblems;

public class evaluateMathExpression {

    public static void main(String[] args) {

        float x = 2.2f;
        float y = 3.3f;
        float z =  1.2f;

        double x2 = Math.pow(x,2);
        System.out.println(x2);
        double y2 = Math.pow(y,2);
        System.out.println(y2);

        double z2 = Math.abs(z);
        System.out.println(z2);

        double v = (x2 + y2) - (z2);
        System.out.println(v);

        double finalExpression = Math.cbrt(v);

        System.out.println(finalExpression);

    }

}
