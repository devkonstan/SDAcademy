package list24;

public class DataManager{
    private final Repo repo;

    DataManager(Repo repo) {

        this.repo=repo;
    } //konstruktor

    void showData() {

        repo.load();
    }
    void addData() {
        repo.save();
    }

}
