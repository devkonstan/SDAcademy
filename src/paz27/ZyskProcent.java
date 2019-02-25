package paz27;

public class ZyskProcent {
    public static void main(String[] args) {
        int kwota=10000;
        double procent =0.05; //f dopisac
        double zysk=0;

        for (int i=1 ; i <= 12; i++) {
            zysk=zysk+(kwota*procent);
            System.out.println(i+" miesiąc "+zysk);
        }

    }
}
