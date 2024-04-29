package MathProblems;

public class checksumProblem {

    /* IMP INTERVIEW PROBLEM: I/P - 3557, O/P - 3+5+5+7=20
     *
     */



    public static void getSum(int x){

        int sum = 0;

        while(x > 0){
            sum = sum + x%10;
            x = x/10;
        }

        System.out.println("Sum is: " +sum);

    }

    public static void main(String[] args) {

        getSum(3557);

    }
}
