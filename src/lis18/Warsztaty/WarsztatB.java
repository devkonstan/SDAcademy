package lis18.Warsztaty;

public class WarsztatB implements Karoseria,Podwozie{

    @Override
    public void naprawiamKaroserie(Samochod sam) {
        sam.karoseria="naprawiona karoseria";
    }

    @Override
    public void naprawiamPodwozie(Samochod sam) {
        System.out.println("niestety nie naprawiamy podwozi");
    }
}
