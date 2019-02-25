package sty26.Programisci;

import java.util.*;

public class TestProgramisci {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Jan", "Kowalski", 25, JezykProgramowania.PYTHON);
        Developer dev2 = new Developer("Daniel", "Ross", 34, JezykProgramowania.JAVA);
        Developer dev3 = new Developer("Ralf", "Kent", 35, JezykProgramowania.JAVA);

        List<Developer> devs = Arrays.asList(dev1,dev2,dev3);
        Set<Developer> developers = new HashSet<>(devs);

        System.out.println(developers.size()); //nadpisana metoda equals() sprawi, ze pokaza sie tylko 2
        System.out.println(developers);
        System.out.println(dev1.hashCode());
        System.out.println(dev2.hashCode());
        System.out.println(developers.contains(new Developer("Jan","Kowalski",25,JezykProgramowania.CPLUSPLUS)));
        System.out.println(developers.contains(new Developer("Jan","Kowalski",25,JezykProgramowania.PYTHON)));

        System.out.println("*******");

        HashMap<JezykProgramowania, Developer> mapa = new HashMap<>();
        mapa.put(JezykProgramowania.PYTHON,dev1);
        mapa.put(JezykProgramowania.PYTHON,dev2); //podmieni dev1 na dev2
        mapa.put(JezykProgramowania.JAVA,dev2);
        mapa.put(JezykProgramowania.CPLUSPLUS,dev3);

        //set nie pozwoli na duplikaty a hashmapa po prostu je podmieni (podmieni wartosci imie, nazwisko, wiek biorac za unikatowy jezyk)
        System.out.println(mapa.size());
        System.out.println(mapa);

        System.out.println("*******");

        System.out.println(JezykProgramowania.CPLUSPLUS.hashCode());
        System.out.println(JezykProgramowania.JAVA.hashCode());
        System.out.println(JezykProgramowania.PYTHON.hashCode());
        System.out.println(mapa.containsKey(JezykProgramowania.JAVA));
        System.out.println(mapa.containsKey(new Developer("Jan","Kowalski",25,JezykProgramowania.PYTHON)));
//hashmapa zawsze podmieni na tego, ktory w kodzie byl jako kolejny podany; ale dlaczego wyswietla w innej kolejnosci?
    }
}