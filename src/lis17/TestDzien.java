package lis17;

public class TestDzien {
    public static void main(String[] args) {
        System.out.println(dzienTyg.values()[3]);
        System.out.println(dzienTyg.valueOf("ŚRODA"));

        dzienTyg dzionek=dzienTyg.ŚRODA;

        dzienTyg[] dzionki =new dzienTyg[10];
        for (int i = 0; i < dzionki.length; i++) {
            dzionki[i] = dzienTyg.SOBOTA;
            System.out.println(dzionki[i]);
        }
    }
}
