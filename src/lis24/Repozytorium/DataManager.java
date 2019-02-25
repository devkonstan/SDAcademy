package lis24.Repozytorium;

public class DataManager{
    private final Repo repo;

    DataManager(Repo repo) {

        this.repo=repo;
    }

    void showData() {

        repo.load();
    }
    void addData() {

        repo.save();
    }

}
