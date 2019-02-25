package gru02;

public class MojaLista<T> {
    Object[] data = new Object[3]; //klasa Object jest klasa z domyslnego pakietu
    int currentIndex = 0;

    public void clear() {
        data = new Object[data.length]; //przypisanie do tablicy nowej tablicy
        currentIndex = 0; //ustawienie indeksu na 0
    }

    public boolean contains(Object t) { //opiera sie na metodzie equals()
        for (int i = 0; i < currentIndex; i++) {
            if (data[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object t) {
        if (t != null) {
            for (int i = 0; i < currentIndex; i++)
                if (t.equals(data[i]))
                    return i;
        }
        return -1;
    }

    public void add(Object t) {
        if (currentIndex + 1 >= data.length) { //zabezpieczenie na wypadek, gdyby tablica byal za mala
            increaseDataSize();
        }
        data[currentIndex] = t;
        currentIndex++;
    }

    public void add(int index, Object t) {
        if (currentIndex + 1 >= data.length) {
            increaseDataSize();
        }

        //tworzymy nowa tymczasowa tablice ograniczona od gory podanym indexem
        Object[] tmp = new Object[data.length];
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                tmp[i] = data[i]; //wsadzamy dane o indexach mniejszych od podanego
            }
        }
        tmp[index] = t; //wsadzamy do podanego indeksu obiekt

        //ogarniamy reszte danych na pozycjach powyzej indeksu podanego w sygnaturze metody
        for (int i = (index + 1); i < (currentIndex + 1); i++) {
            tmp[i] = data[i - 1];
        }
        currentIndex++;

        data = tmp; //wkladamy tymczasowa tablice do tablicy pierwotnej
    }

    public T get(int index) {

        return (T) data[index];
    }

    public int size() {
        return currentIndex;
    }

    private void increaseDataSize() { //utworzenie nowej tablicy, jesli poprzednia za mala
        Object[] newDataArray = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newDataArray[i] = data[i]; //przeniesienie danych ze starej tablicy do nowej
        }

        data = newDataArray; //obiekt starej tablicy staje sie obiektem nowej
    }

    //dodac metode remove
}
