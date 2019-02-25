package lis25;

public class Errorek extends Exception{
    public Errorek(String errorMessage) {
//        System.out.println("rzucam mój błąd");
        super(errorMessage);
    }
}
