package sty26;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(2, 34, 51, 24, 1, 2, 4, 34); //6 unikatow

        Set<Integer> secik1 = new HashSet<>(lista);
        System.out.println(secik1.size());

        Set<Integer> secik2 = new HashSet<>();
//        secik2.addAll(lista);
        System.out.println(secik2.size());

        Set<Integer> secik3 = new HashSet<>();
        for (Integer item : lista) secik3.add(item);
        System.out.println(secik3.size());

        System.out.println(secik3);



    }
}
