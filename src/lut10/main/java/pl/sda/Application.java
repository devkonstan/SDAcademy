package lut10.main.java.pl.sda;

import lut10.main.java.pl.sda.advanced.FluentBuilder;

public class Application {
    public static void main(String[]args){
        FluentBuilder fb = new FluentBuilder();
        fb.setA(1)
          .setB(2)
          .setC(3);
    }
}
