public class pro_while {
    public static void main(String[] args) {
        int kwota=10000;
        double procent =0.05; //f dopisac
        double zysk=0;
        //int okres =0;

        for (int i=1 ; i <= 12; i++) {
            zysk=zysk+(kwota*procent);
            System.out.println(i+" "+zysk);
        }

    }
}
