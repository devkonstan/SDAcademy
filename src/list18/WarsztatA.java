package list18;

public class WarsztatA implements Karoseria, Podwozie {

    @Override
    public void naprawiamKaroserie(Samochod auto) {
        System.out.println("nie naprawiamy karoserii");
    }

    @Override
    public void naprawiamPodwozie(Samochod auto) {
        auto.podwozie="naprawione podwozie";
    }
}
