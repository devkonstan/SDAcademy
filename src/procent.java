public class procent {
    public static void main(String[] args) {
        int kwota=10000;
        float procent =0.05f;
        float zysk;
        zysk=kwota*procent;
        System.out.println("po miesiacu dostaniesz "+zysk+" zł");
        //kwota+=zysk;
        System.out.println("w 2 miesiacu dostaniesz "+(kwota+=zysk)*procent+" zł");
        zysk=zysk+(kwota*procent); //2
        System.out.println(zysk);
        zysk=zysk+(kwota*procent); //3
        zysk=zysk+(kwota*procent); //4
        zysk=zysk+(kwota*procent); //5
        zysk=zysk+(kwota*procent); //6
        zysk=zysk+(kwota*procent); //7
        zysk=zysk+(kwota*procent); //8
        zysk=zysk+(kwota*procent); //9
        zysk=zysk+(kwota*procent); //10
        zysk=zysk+(kwota*procent); //11
        System.out.println(zysk);
        zysk=zysk+(kwota*procent); //12
        System.out.println("czysty zysk po 12 miesiacach "+zysk+" zł");
    }
}
