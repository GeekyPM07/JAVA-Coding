package MathProblems;

public class P8SwapIntNos {

    int x = 5;
    int y = 10;

    public void swapWithoutThirdVariable(){

        x = x*y; //50
        y = x/y; //50/10 = 5

        x = x/y;

        System.out.println("x after swapping is: " +x);
        System.out.println("y after swapping is: " +y);

    }

    public void usingThirdVariable(){

        int temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("x after swapping is: " +x);
        System.out.println("y after swapping is: " +y);

    }

    public static void main(String args[]){

        P8SwapIntNos obj = new P8SwapIntNos();
        obj.swapWithoutThirdVariable();

    }


}
