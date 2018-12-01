import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random generator = new Random();
        int secret = generator.nextInt(2);
        System.out.println("podaj liczbę od 0 do 9");
        Scanner scanner = new Scanner(System.in);
        int searchfor = 0;
        int i = 0;
        while (true) {
            searchfor = scanner.nextInt();
            i++;
            if (secret == searchfor) {
                System.out.println("zgadles!!!");
                System.out.println("ta liczba to " + secret);
                System.out.println("zgadywanie zajelo " + i + " prób");
                break;
            }
            else if (secret>searchfor){
                System.out.println("szukana liczba jest wieksza od podanej");
            }
            else if (secret<searchfor) {
                System.out.println("szukana liczba jest mniejsza od podanej");
            }

        }
    }
}
