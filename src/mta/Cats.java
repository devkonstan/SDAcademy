package mta;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat("Bonifacy");

        System.out.println(c1.LEGS_COUNT);
        System.out.println(Cat.LEGS_COUNT);

        System.out.println(c1.DEFAULT_COLOR);
        c1.DEFAULT_COLOR = "czarny";
        System.out.println(c1.DEFAULT_COLOR);


        byte b;
        int i;
        short s;
        i = 127;
        System.out.println(Integer.toString(Byte.MAX_VALUE));
        b = (byte) i;
        System.out.println(b);
        i = b;
        System.out.println(i);
        s = b;
        s = (short) i;
        System.out.println(s);
        System.out.println("*****");
        int x = Integer.MAX_VALUE;
        System.out.println(x + 1);

//        int y =Math.addExact(Integer.MAX_VALUE,10);
//        System.out.println(y);

        int z = Math.toIntExact(23224242L);
        System.out.println(z);

        BigInteger b1 = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(b1);

        double d = 2.0 - 1.8;
        System.out.println(d);

        BigDecimal d1 = new BigDecimal(2.0);
        BigDecimal d2 = new BigDecimal(1.8);
        BigDecimal d3 = d1.subtract(d2);
        System.out.println(d3);


    }
}
