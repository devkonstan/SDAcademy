package Poli;

public class Main {
    public static void main(String[] args) {
        User uzytkownik=new User();

        uzytkownik.getAllMethods();
        System.out.println("******");

        Portal portalik =new Portal();
        portalik.login(uzytkownik);
        portalik.editProfile(uzytkownik);
        portalik.getPaymentHelp(uzytkownik);

        uzytkownik.getUserName();
        uzytkownik.getPassword();
    }
}
