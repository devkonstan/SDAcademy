package lis18;

public class testUtils {
    public static void main(String[] args) {
        System.out.println("is this string empty? = " + textUtils.isEmpty2(null));
        System.out.println("is this string length greater than 4? "+textUtils.isGreaterThan("ra",1));
        System.out.println(textUtils.isGreaterThan("",0)); //false
        System.out.println(textUtils.isGreaterThan("   ",-3)); //true
        System.out.println(textUtils.isGreaterThan(null,-3)); //false
        System.out.println(textUtils.isGreaterThan(null,0)); //false

        System.out.println("*****");
        String s1 = "";
        String s2 = "javatpoint";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }
}
