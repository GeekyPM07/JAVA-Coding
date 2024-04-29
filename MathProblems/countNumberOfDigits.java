package MathProblems;

public class countNumberOfDigits {

    public static void main(String[] args) {

        int x = 514857;

        int count = 0;

        int remainder = 0;

        while(x > 0){

            remainder = x % 10;
            count++;

            x = x / 10;

        }

        System.out.println("Number of digits in entered number is: " +count);
    }

}
