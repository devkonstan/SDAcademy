package mta;

import java.util.*;
import java.io.*;

public class SzafaGrajaca   {
    ArrayList<Piosenka> listaPiosenek = new ArrayList<Piosenka>();
//    ArrayList<String> listaPiosenek = new ArrayList<String>();
//    Set<String> listaPiosenek = new TreeSet<String>();


    public static void main(String[] args) {

        new SzafaGrajaca().doDziela();
    }

    public void doDziela() {
        pobierzPiosenki();
        Collections.sort(listaPiosenek);
        //Collections.reverse(listaPiosenek);
        //Collections.shuffle(listaPiosenek);
        System.out.println(listaPiosenek);
        System.out.println("********");

        //HashSet<Piosenka> zbiorPiosenek = new HashSet<Piosenka>();
        TreeSet<Piosenka> zbiorPiosenek = new TreeSet<>(); //ten sortuje samodzielnie -> ma metode compareTo()
        zbiorPiosenek.addAll(listaPiosenek);
        System.out.println(zbiorPiosenek);
    }

    void pobierzPiosenki() {
        try {
            File plik = new File("ListaPiosenek.txt");
            BufferedReader reader = new BufferedReader(new FileReader(plik));
            String wiersz = null;
            while ((wiersz = reader.readLine()) != null) {
                dodajPiosenke(wiersz);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

//    void dodajPiosenke(String wierszDoAnalizy) {
//        String[] elementy = wierszDoAnalizy.split("/");
//        listaPiosenek.add(elementy[0]);
//    }

    void dodajPiosenke(String wierszDoAnalizy) {
        String[] elementy = wierszDoAnalizy.split("/");
        Piosenka nastepnaPiosenka = new Piosenka(elementy[0], elementy[1], elementy[2], elementy[3]);
        listaPiosenek.add(nastepnaPiosenka);
    }
}

