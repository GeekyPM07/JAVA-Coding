package Concepts.Encapsulation.Cop;

public class Police {

    public static void main(String[] args) {

        Cop cop2 = new Cop("M54A2");

        String PoliceGun = cop2.getGun();
        System.out.println(PoliceGun);

        cop2.canIShoot();

    }
}
