package paz27;

public class DzienTyg {
    public static void main(String[] args) {

        for (int dzienTyg = 1; dzienTyg <= 365; dzienTyg++) {

            switch (dzienTyg%7) {
                case 1:
                    System.out.println(dzienTyg+" poniedzialek");
                    break;
                case 2:
                    System.out.println(dzienTyg+" wtorek");
                    break;
                case 3:
                    System.out.println(dzienTyg+" sroda");
                    break;
                case 4:
                    System.out.println(dzienTyg+" czwartek");
                    break;
                case 5:
                    System.out.println(dzienTyg+" piatek");
                    break;
                case 6:
                    System.out.println(dzienTyg+" sobota");
                    break;
                case 0:
                    System.out.println(dzienTyg+" niedziela");
                    break;
                default:
                    System.out.println("brak takiego dnia ");

            }

        }
    }
}
