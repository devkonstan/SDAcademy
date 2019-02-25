package lut09.main.java.pl.sda;

import lut09.main.java.pl.sda.advanced.FluentBuilder;
import lut09.main.java.pl.sda.entry.Calculator;

public class Application {
    public static void main(String[]args){
        FluentBuilder fb = new FluentBuilder();
        fb.setA(1)
          .setB(2)
          .setC(3);

        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println(result);
    }
}
