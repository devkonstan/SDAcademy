package list17;

public class cwik {
    //    public void say(String what) {
//        System.out.println(name + " : - " + what + " WRRR!!!");
//    }
//
//    public void plywam() {
//        say("Plywam jak Tygrys");
//    }
//        System.out.println("podaj liczbę x: ");
//        Scanner sc = new Scanner(System.in);
//        x = sc.nextInt();

    public int sumaIteracja(int n) {
        int suma = 0;
        while(n > 0) {
            suma = suma+n;
            n--;
            System.out.println(suma);
        }
        return suma;
    }

    public static void main(String[] args) {
        cwik obiekt=new cwik();
        obiekt.sumaIteracja(2);
    }
}
