package gru08;

import java.util.Set;
import java.util.TreeSet;

public class Countries {

    private Set<Country> kraje = new TreeSet<>();

    public void addCountry(Country kraj) {
        kraje.add(kraj);
    }

    public Set<Country> getAllCountries() {
        return kraje;
    }

    public void removeCountry(String name) {
        for (Country country : kraje) {
            if (country.getName().equals(name)) {
                kraje.remove(country);
                break;
            }
        }
    }

    public void updateCountry(String name, Country nowyKraj) {
        for (Country country : kraje) {
            if (country.getName().equals(name)) {
                kraje.remove(country);
                kraje.add(nowyKraj);
                break;
            } else {
                System.out.println("brak takiego kraju w bazie");
            }
        }
    }

    @Override
    public String toString() {
        return "Countries{" +
                "kraje=" + kraje +
                '}';
    }

    public Country getCountry(String name) {
        for (Country country : kraje) {
            if (country.getName().equals(name)) {
                return country;
            }
        }
        return null;
    }

    public Country getCapital(String capital) {
        for (Country country : kraje) {
            if (country.getCapital().equals(capital)) {
                return country;
            }
        }
        return null;
    }


}


