package Concepts.Encapsulation.Website;

/* Encapsulation refers to the practice of keeping variables,methods inside a UNIT i.e Class by using the concept of Data HIDING
   The instance variables should be using Acess Modifiers i.e protected, private if set as PRIVATE, and can be accessed by getter/setter methods.
 */

public class Website {

    private String eMail;
    private String password;

    protected Website(){

        this.eMail = "adminLogin@Website.com";
        this.password = "admin@543";

    }

    /*
        Making Setter and Getter Methods PUBLIC, so that methods from another class can access eMail,password instance variables
     */

    public String seteMail(String eMailFromSetterMethodCall) {
        this.eMail = eMailFromSetterMethodCall;

        return this.eMail;
    }

    public String setPassword(String passwordFromSetterMethodCall) {
        this.password = passwordFromSetterMethodCall;

        return this.password;
    }


    public String geteMail() {
        return this.eMail;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isLoggedIn(String eMailFromMethodCall, String passwordFromMethodCall){

        if(eMailFromMethodCall.equals(this.eMail) && passwordFromMethodCall.equals(this.password)){
            System.out.println("Logged IN");
            return true;
        } else {
            System.out.println("Wrong creds");
            return false;
        }
    }
}

class Admin {

    public static void main(String[] args) {

        //Setting admin eMail and password via Constructor
        Website wb = new Website();

        String adminEmail = wb.geteMail();
        String adminPassword = wb.getPassword();
        System.out.println("Admin EMAIL: " +adminEmail);
        System.out.println("Admin Password: " +adminPassword);

        /* No one should be able to change admin email password

        wb.email = "123@gmail.com"; -- not accessible
        wb.password = "password"; -- not accessible

         */

        wb.isLoggedIn(adminEmail, adminPassword);
    }
}
