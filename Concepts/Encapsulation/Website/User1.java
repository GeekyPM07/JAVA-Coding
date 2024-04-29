package Concepts.Encapsulation.Website;

public class User1 extends Website {

    public User1() {

        /*
            E-Mail, password of parent class not accessible directly via child class


        eMail = "123@gmail.com";
        password = "pwd";


         */

    }


    public static void main(String[] args) {

        //Hence -- Website class, its constructor, variables should be private, so that User1 class cannot change the ADMIN Credentials


        User1 u1 = new User1();


       /*
            Direct accessible not possible via child class, this will overwrite the admin credentials.

            u1.email = "123";
            u1.password = "pwd";


        */

        /*
            Using getter setter methods to access private Website class variables and modify them.
         */

        String user1EmailSet = u1.seteMail("123@gmail.com");
        String user1PasswordSet = u1.setPassword("pwd");

        System.out.println(u1.geteMail());
        System.out.println(u1.getPassword());

        u1.isLoggedIn(u1.geteMail(), u1.getPassword());

    }
}
