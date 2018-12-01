package list25;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class zapisDoPliku {
    public static void main(String[] args) {

        try {
            File file = new File("plik.txt");
            System.out.println(file.exists());
            FileWriter fw = new FileWriter(file, false);
            fw.append("testRownosci");
            fw.append("2 \n");
            fw.append("4 \n");
            fw.flush();
            fw.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
