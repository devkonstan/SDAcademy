package lut16.pl.sda.creational.builder;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    private Customer(String name, String lastName) {
    }

    private Customer() {

    }

    public Customer(String name, String lastName, LocalDate birthDate, String pesel, String profession, String city, String country) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = pesel;
        this.profession = profession;
        this.city = city;
        this.country = country;
    }

    public static Customer createWithDefaults() {
        return new Customer("Frank", "Nash");
    }


    public static Builder createCustom(String name, String lastName) {

        return new Builder(name, lastName);
    }



    //robimy pesel jako opcjonalny
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public String getProfession() {
        return profession;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }



    //parametry wymagane mozemy wsadzic w konstruktor (name,lastName)
    public static class Builder {
        private Customer customer;

        public Builder(String name, String lastName) {

            customer = new Customer(name, lastName);
        }

        public void setName(String name) {
            customer.name = name;
        }

        public void setLastName(String lastName) {
            customer.lastName = lastName;
        }

        public void setBirthDate(LocalDate birthDate) {
            customer.birthDate = birthDate;
        }

        public void setPesel(String pesel) {
            Regex regex = new Regex("\\d{11}");
            customer.pesel = pesel;
        }

        public void setProfession(String profession) {
            customer.profession = profession;
        }

        public void setCity(String city) {
            customer.city = city;
        }

        public void setCountry(String country) {
            customer.country = country;
        }


        public Customer build() {
            return customer;
        }
    }


    public static class Builder2 {
        private Customer customer = new Customer();

        public Builder2 setName(String name) {
            customer.name = name;
            return this;
        }

        public Builder2 setLastName(String lastName) {
            customer.lastName = lastName;
            return this;
        }

        public Builder2 bornAt(LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public Builder2 withPesel(String pesel) {
            Regex regex = new Regex("\\d{11}");
            customer.pesel = pesel;
            return this;
        }

        public Builder2 setProfession(String profession) {
            customer.profession = profession;
            return this;
        }

        public Builder2 livesIn(String city) {
            customer.city = city;
            return this;
        }

        public Builder2 setCountry(String country) {
            customer.country = country;
            return this;
        }


        public Customer build() {
            return customer;
        }

    }
}
