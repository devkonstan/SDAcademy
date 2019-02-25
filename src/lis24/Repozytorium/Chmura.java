package lis24.Repozytorium;

public class Chmura implements Repo{
    @Override
    public void save() {
        System.out.println("zapisuje w chmurze");
    }

    @Override
    public void load() {
        System.out.println("laduje z chmury");
    }
}
