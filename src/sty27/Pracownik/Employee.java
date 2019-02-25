package sty27.Pracownik;

public class Employee implements Cloneable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { //zmieniamy protected na private, zeby bylo to dostepne poza pakietem
        return super.clone();
    }

}

