package list17;

public class testDni {
    public static void main(String[] args) {

        for (dzienTyg value : dzienTyg.values()) {
            System.out.println(value.dajNrDnia()+value.dajNazwePoPolsku());
        }

    }
}
