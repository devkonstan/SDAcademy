package Poli;

public class Portal {
    void login(Auth user) { //polimorfuje dla ograniczenia dostepu
        user.getPassword();
        user.getUserName();
    }
    void editProfile(AnotherInterface user) {
        user.getSex();
        user.getTopSecretData();
    }
    public void getPaymentHelp(User user) {
        user.getPaymentHistory();
    }
    //przeslonic kazda z metod zastepujac je taka z ograniczona funkcjonalnoscia?
}
