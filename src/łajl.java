public class łajl {
    public static void main(String[] args) {
        int kwota=10000;
        double procent =0.05; //f dopisac
        double zysk=0;
        int okres =0;

        while (zysk < 5000){
            zysk=zysk+(kwota*procent);
            okres++;
        }
        System.out.println(okres);
        System.out.println(zysk);
        //ile miesiecy czekac aby zysk wyniosl 5000?
    }
}
