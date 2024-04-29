package Strings;

public class reverseSentencesNotWords {

    public void usingSplitMethod(){

        String s = "My Name is Prateek Mishra";

        String splitArray[] = s.split(" ");

        int length = splitArray.length;
        System.out.println(length);

        String revSentences = "";

        for(int i = length-1; i >=0; i--){
            revSentences = revSentences + splitArray[i] + " ";
        }

        System.out.println(revSentences);

    }

    public static void main(String[] args) {

        reverseSentencesNotWords obj = new reverseSentencesNotWords();
        obj.usingSplitMethod();

    }
}
