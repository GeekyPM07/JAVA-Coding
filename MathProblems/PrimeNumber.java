package MathProblems;

public class PrimeNumber {

    public void checkPrimeNumber(){

        int num = 11;
        int flag = 0;

        //Check if entered number is divisible by any number till num-1
        for(int i = 2; i <= num-1; i++) {

            if(num%i == 0){

                System.out.println(num + " is NOT prime");
                flag = 1;
                break;
            }
        }

        if (flag == 0){
            System.out.println(num + " is prime");
        }
    }

    public void checkPrimeNumberbw1to100(){

        for(int num=2; num <= 100; num++){

            int flag = 0;

            //Check if entered number is divisible by any number till num-1
            for(int i=2; i <= num-1; i++){

                if(num%i == 0){
                    //System.out.println(i + " is not prime");
                    flag=1;
                    break;
                }
            }

            if(flag == 0){
                System.out.println(num + "  is prime");
            }

        }
    }

    public static void main(String[] args) {

        PrimeNumber c = new PrimeNumber();
        //c.checkPrimeNumber();
        c.checkPrimeNumberbw1to100();

    }
}
