package lis17;

public class testDni {
    public static void main(String[] args) {

        for (dzienTyg dzien : dzienTyg.values()) {
            System.out.println(dzien.dajNrDnia()+" "+dzien.dajNazwePoPolsku());
        }

    }
}
