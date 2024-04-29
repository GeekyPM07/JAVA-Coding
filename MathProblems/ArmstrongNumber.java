package MathProblems;

/*
    ARMSTRONG NUMBER -- 153

    1*1*1 + 5*5*5 + 3*3*3 = 153


 */


public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153;

        int orignialNumber = number;

        int sum = 0;

        while (number > 0){

            int remainder = number%10;

            sum = sum + (remainder*remainder*remainder);

            number = number / 10;

        }

        System.out.println("Sum is: " +sum);

        if(sum == orignialNumber){
            System.out.println(orignialNumber + " is an Armstrong number!");
        }else {
            System.out.println(orignialNumber + " is NOT an Armstrong number!");
        }
    }
}
