package Strings;

public class leftRotateStringBy3Position {

    public static void main(String[] args) {

        String str = "Arun";
        char arr[] = str.toCharArray();

        int n = 3;

        for(int j = 0; j < n; j++){

            char first = arr[0];

            for(int i = 1; i < arr.length; i++){

                arr[i-1] = arr[i];

                if(i == 3){
                    arr[i] = first;
                }
            }
        }

        String rotated = "";

        for(char c: arr){
            rotated = rotated + c;
        }

        System.out.println("Modified String is: " +rotated);

    }
}
