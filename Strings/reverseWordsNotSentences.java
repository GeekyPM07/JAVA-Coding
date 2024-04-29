package Strings;

public class reverseWordsNotSentences {

    public void reverseWords(String s){

        String arr[] = s.split(" ");

        String empty = " ";

        for(String element: arr){

            int length = element.length();

            for(int i = length-1; i >= 0; i--){
                empty = empty + element.charAt(i);
            }

            empty = empty + " ";

        }

        System.out.println(empty);

    }

    public static void main(String[] args) {

        String str = "My Name is Prateek Mishra";

        reverseWordsNotSentences obj = new reverseWordsNotSentences();
        obj.reverseWords(str);

    }

}
