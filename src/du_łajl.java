public class du_łajl {
    public static void main(String[] args) {
        int kwota=10000;
        double procent =0.05; //f dopisac
        double zysk=0;
        int okres =1;

        do {
           zysk=zysk+(kwota*procent);
                   okres++;
        } while (okres <=12);
        System.out.println(zysk);
    }
}
