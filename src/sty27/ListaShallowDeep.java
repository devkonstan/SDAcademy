package sty27;

// Napisz aplikację, która realizuje cash na podstawie aktualnej listy języków programowania. Aplikacja zaweria:
// List<String> programmingLanguages = ListaTablic.asList(“Java”, “python”, “c++”, “kotlin”);
//
// i na podstawie listy chcemy stworzyć drugą listę
//
// która jest kopią pierwszej.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaShallowDeep {
    public static void main(String[] args) {
        
        List<String> programmingLanguages = Arrays.asList("Java", "python", "c++", "kotlin");
        System.out.println(programmingLanguages);

        List<String> cacheProgrammingLanguages = new ArrayList<>(programmingLanguages);
        cacheProgrammingLanguages.remove(0);
        cacheProgrammingLanguages.remove(1);
        System.out.println(cacheProgrammingLanguages);

        List<String> cacheProgrammingLanguagesNew = new ArrayList<>();
        cacheProgrammingLanguagesNew.addAll(programmingLanguages);
        cacheProgrammingLanguagesNew.remove(1);
        System.out.println(cacheProgrammingLanguagesNew);

    }
}