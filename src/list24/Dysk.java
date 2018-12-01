package list24;

public class Dysk implements Repo{
    @Override
    public void save() {
        System.out.println("zapisuje na dysku");
    }

    @Override
    public void load() {
        System.out.println("laduje na dysk");
    }

}
