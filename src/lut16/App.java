package lut16;

import lut16.pl.sda.creational.builder.Customer;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        //fluentBuilder tworzy sie tak zeby dalo sie to czytac jak historyjke
        Customer customer1 = new Customer.Builder2()
                .setName("John")
                .setLastName("Smith")
                .withPesel("32324")
                .livesIn("Los Angeles")
                .bornAt(LocalDate.of(1984, 12, 10))
                .build();


        Customer.Builder customerbuilder = new Customer.Builder("Jan", "Kowalski");
        customerbuilder.setName("John");
        customerbuilder.setLastName("Smith");
        Customer customer2 = customerbuilder.build();

        Customer defaultCustomer = Customer.createWithDefaults();

        Customer customer3 = Customer.createCustom("Jan", "Kowalski")
                //.withPesel("32324")
                //.livesIn("Los Angeles")
                //.bornAt(LocalDate.of(1984,12,10))
                .build();

        System.out.println(customer3);
        System.out.println(customer2);
        System.out.println(customer1);
    }


}
