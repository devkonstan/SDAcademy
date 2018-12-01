package list18;

public class WarsztatB implements Karoseria,Podwozie{

    @Override
    public void naprawiamKaroserie(Samochod auto) {
        auto.karoseria="naprawiona karoseria";
    }

    @Override
    public void naprawiamPodwozie(Samochod auto) {
        System.out.println("niestety nie naprawiamy podwozi");
    }
}
