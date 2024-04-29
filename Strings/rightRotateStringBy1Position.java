package Strings;

public class rightRotateStringBy1Position {

    public static void main(String[] args) {

        String str = "Arun";
        char arr[] = str.toCharArray();

        char last = arr[arr.length-1];

        for(int i = arr.length-2; i >= 0; i--){

            arr[i+1] = arr[i];

            if(i == 0){
                arr[i] = last;
            }
        }

        String rotated = "";

        for (char c: arr){

            rotated = rotated + c;
        }

        System.out.println("Modified String is: " +rotated);

    }
}
