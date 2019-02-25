package gru01;

//tworzymy wlasny typ danych
public class MojGeneryk<J, T, W> {
    private J j;

    //konstruktor zlozny tylko z 1 elementu klasy
    MojGeneryk(J j) {

        this.j = j;
    }

    MojGeneryk(J j, T t, W w) {
        //zmienne przekazane w konstruktorze przepadna, bo nie zostana uwzglednione
    }

    //metoda
    J getJData() {
        return j;

    }


}
