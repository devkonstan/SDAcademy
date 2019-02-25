package lis24.Repozytorium;

public class DataManagerComposer {
    public static void main(String[] args) {

        DataManager dm1=new DataManager(new Chmura());
        dm1.addData();
        dm1.showData();

        System.out.println("********");

        DataManager dm2=new DataManager(new Dysk());
        dm2.addData();
        dm2.showData();
    }

}
