package sty13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Szczecin");
        lista.add("Katowice");
        lista.add("Gdańsk");

//        for (String s : lista) {
//            s = "Miasto_" + s;
//            System.out.println(s);
//        }
        lista.stream().sorted((s1, s2) ->
                {
                    if (s1.compareTo(s2) > 0) return 1;
                    else if (s1.compareTo(s2) == 0) return 0;
                    else return -1;
                }
        ).forEach(s ->
        {
            s = "Miasto_" + s;
            System.out.println(s);
        });

        lista.stream().map(s -> s = s + " jest ql").sorted().filter(s -> s.startsWith("Sz")).forEach(System.out::println); //przekazujemy adres do metody, ktora chcemy wywolac
    }   //strumienie: listy, zbiory, kolekcje
}