public class wiek {
    public static void main(String[] args) {
        int wiek=20;
        System.out.println("aktualnie masz "+wiek+" lat");
        wiek++;
        System.out.println("gratulacje, jestes starszy o rok i masz "+wiek+" lat");
        wiek=wiek+1;
        System.out.println("gratulacje, jestes starszy o rok i masz "+wiek+" lat");
        wiek+=1;
        System.out.println("gratulacje, jestes starszy o rok i masz "+wiek+" lat");
        wiek++;
        System.out.println("gratulacje, jestes starszy o rok i masz "+wiek+" lat");
        ++wiek;
        System.out.println("gratulacje, jestes starszy o rok i masz "+wiek+" lat");

        System.out.println("*******");

        for (int wieczek = 20; wieczek <= 25; wieczek++) {
            System.out.println(wieczek);

        }
    }
}
