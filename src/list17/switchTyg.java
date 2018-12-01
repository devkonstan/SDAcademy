package list17;

public class switchTyg {

        dzienTyg dzionek;

    public switchTyg(dzienTyg dzionek) {
        this.dzionek = dzionek;
    }

    public void sprawdzam() {
            switch (dzionek) {
                case PONIEDZIALEK:
                    System.out.println("poniedzialek");
                    break;
                case WTOREK:
                    System.out.println("wtorek");
                    break;
                case ŚRODA:
                    System.out.println("środa");
                    break;
                case CZWARTEK:
                    System.out.println("czwartek");
                    break;
                case PIĄTEK:
                    System.out.println("piątek");
                    break;
                case SOBOTA:
                    System.out.println("sobota");
                    break;
                case NIEDZIELA:
                    System.out.println("niedziela");
                    break;
                default:
                    System.out.println("nie ma takiego dnia!");
            }

        }
    }
