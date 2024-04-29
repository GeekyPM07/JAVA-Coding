package MathProblems;

public class P3RevInteger {

    public long RevIntegerUsingAlgo(Long x){

        long num = x;
        long rev = 0;

        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num / 10;

        }

        System.out.println("Reverse number using algo: " +rev);
        return rev;

    }

    public static void main(String args[]){

        P3RevInteger obj = new P3RevInteger();

        //Reverse integer using Algorithm
        obj.RevIntegerUsingAlgo((long)12345);

        //Reverse integer using StringBuffer class
        StringBuffer sb1 = new StringBuffer(String.valueOf((long)12345));
        System.out.println("Reverse integer using StringBuffer class: " +sb1.reverse());
    }
}
