package lis25;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class zapisDoPliku {
    public static void main(String[] args) {

        try {
            File file = new File("plik.txt");
            System.out.println(file.exists());
            FileWriter fw = new FileWriter(file, false); //jesli true to dopisuje do pliku ciagle nowe wartosci
            fw.append("testRownosci\n");
            fw.append("2 \n");
            fw.append("4 \n");
            fw.flush();
            fw.close();

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
