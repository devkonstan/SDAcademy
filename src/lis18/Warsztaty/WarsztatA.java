package lis18.Warsztaty;

public class WarsztatA implements Karoseria, Podwozie {

    @Override
    public void naprawiamKaroserie(Samochod sam) {
        System.out.println("niestety nie naprawiamy karoserii");
    }

    @Override
    public void naprawiamPodwozie(Samochod sam) {
        sam.podwozie="naprawione podwozie";
    }
}
