package gru09;

import java.io.FileNotFoundException;

public class Wyjatek2 {
    public static void main(String[] args) {
        try {
            anotherMethod();
            System.out.println("*****");
            method();
        } catch (FileNotFoundException fnfe) {
            System.out.println("exception");
        }
    }

    static void method() throws FileNotFoundException {
        System.out.println("may throw something");
    }

    static void anotherMethod() throws FileNotFoundException {
        System.out.println("first throw");
        method();
    }


}
