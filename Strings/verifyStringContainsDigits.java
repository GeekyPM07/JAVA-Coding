package Strings;

public class verifyStringContainsDigits {

    public boolean isEmpty(String s){

        if(s == null) {
            return true;
        } else if (s.length() == 0){
            return true;
        }

        return false;

    }

    public boolean isPureNumeric(String s){

        if(isEmpty(s) == true){
            return false;
        }

            for(int i=0; i < s.length(); i++){
                char ch = s.charAt(i);

                if(! Character.isDigit(ch)){
                    return false;
                }
            }

            return true;

    }

    public static void main(String[] args) {

        verifyStringContainsDigits obj = new verifyStringContainsDigits();
        System.out.println(obj.isPureNumeric("1234"));
        System.out.println(obj.isPureNumeric(null));
        System.out.println(obj.isPureNumeric(""));
        System.out.println(obj.isPureNumeric(" "));
        System.out.println(obj.isPureNumeric("test"));
        System.out.println(obj.isPureNumeric("test123"));
        System.out.println(obj.isPureNumeric("test"));
        System.out.println(obj.isPureNumeric("2.3"));
        System.out.println(obj.isPureNumeric("+123"));
        System.out.println(obj.isPureNumeric("-123"));
        System.out.println(obj.isPureNumeric("0"));
        System.out.println(obj.isPureNumeric("\u0967")); //unicode value represents digits.
        System.out.println(obj.isPureNumeric("$"));
        System.out.println(obj.isPureNumeric("1 1 1"));

    }

}
