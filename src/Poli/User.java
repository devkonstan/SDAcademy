package Poli;

public class User implements Auth,PaymentHistory,AnotherInterface {

    //uzyskane poprzez Alt+Insert -> add methods
    @Override
    public void getUserName() {
        System.out.println("imię");
    }

    @Override
    public void getPassword() {
        System.out.println("hasło");
    }

    @Override
    public void getPaymentHistory() {
        System.out.println("wyświetl historię płatności");
    }

    @Override
    public void getTopSecretData() {
        System.out.println("podaj dane wrażliwe");
    }

    @Override
    public void getSex() {
        System.out.println(eSex.M);
    }

    void getAllMethods() {
        getPassword();
        getPaymentHistory();
        getSex();
        getTopSecretData();
        getUserName();
    }
}
