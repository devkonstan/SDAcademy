package gru02;

import java.util.*;

//klucz integer, value String
public class HashMapa {
    public static void main(String[] args) {
        HashMap<String, Integer[]> dziennik = new HashMap<>();

        Integer[] ocenyJasia = {1, 1, 1, 1, 1};
        dziennik.put("Jasiu", ocenyJasia);
        Integer[] ocenyJacka = {2, 1, 3, 1, 1, 1};
        dziennik.put("Jacek", ocenyJacka);
        Integer[] malgosia = {5};
        dziennik.put("Malgosia", malgosia);
        Integer[] ewe = {4, 3, 5, 4, 4};
        dziennik.put("Ewa", ewe);

        for (Integer[] oceny : dziennik.values()) {
            for (int i = 0; i < oceny.length; i++) {
                System.out.print(oceny[i] + " ");

            }
            System.out.println();
        }
        System.out.println("ilosc dzieci: " + dziennik.size());

        System.out.println("********");

        Set secik = dziennik.entrySet();
        Iterator iteratorek = secik.iterator();
        while (iteratorek.hasNext()) {
            Map.Entry wpis = (Map.Entry) iteratorek.next();                                               //to jest rzutowane
            System.out.println("key is: " + wpis.getKey() + " & value is: " +  Arrays.toString((Object[]) wpis.getValue()));
        }


        System.out.println("**********");

        if (dziennik.containsKey("Ewa")) {
            Integer[] nowaEwa = {4, 3, 5, 4, 4};
            dziennik.put("Ewa_2", ewe);
        } else {
            Integer[] nowaEwa = {4, 3, 5, 4, 4};
            dziennik.put("Ewa", ewe);
        }

        System.out.println(dziennik.keySet().toString() + " ");
        for (Integer[] value : dziennik.values()) {
            System.out.print(" " + Arrays.toString(value));
        }
        System.out.println("**********");

        for (String name : dziennik.keySet()) {

            String key = name;
            System.out.println(key + " " + Arrays.toString(dziennik.get(key)));
        }


        Integer[] ewe2 = {1, 1, 1, 3, 1};
        dziennik.put("Ewa", ewe2);
        dziennik.put("1", null);
        dziennik.put("2", null);
        dziennik.put(null, ewe2);
        System.out.println(Arrays.toString(dziennik.get("Jasiu"))); //co wpisac zeby przelecialo przez wszystkie?

    }
}
