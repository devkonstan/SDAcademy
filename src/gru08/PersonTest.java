package gru08;

public class PersonTest {
    public static void main(String[] args) {

        Person osoba1 = new Person("Jan", "Kowalski","janek","admin123");
        Person osoba2 = new Person("Janek", "Krecina","zdzichu","admin231");
        Person osoba3 = new Person("Andrzej", "Duda","endrju","admin321");

        PersonService serwis = new PersonService();
        serwis.save(osoba1);
        serwis.save(osoba2);
        serwis.save(osoba3);

        System.out.println(serwis.searchName("Ja"));
        System.out.println(serwis.log("janek","admin123"));
        System.out.println(serwis.log("janek2","admin123"));

        Person osoba4=new Person("Harry","Redknapp","harry","12345678");
        serwis.save(osoba4);
        System.out.println(serwis.searchName("harry"));
    }
}
