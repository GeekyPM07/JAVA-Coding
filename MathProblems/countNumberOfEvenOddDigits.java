package MathProblems;

public class countNumberOfEvenOddDigits {


    public static void main(String[] args) {

        int x = 514857;

        int countEven = 0;
        int countOdd = 0;

        while (x > 0){

            int num = x%10;

            if(num%2 == 0){
                countEven++;
            } else {
                countOdd++;
            }

            x = x/10;

        }

        System.out.println("Number of Even digits in entered number is: " +countEven);
        System.out.println("Number of Odd digits in entered number is: " +countOdd);
    }
}
