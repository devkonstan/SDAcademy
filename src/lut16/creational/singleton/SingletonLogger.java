package lut16.pl.sda.creational.singleton;

public class SingletonLogger {

    private static SingletonLogger sl;

    private SingletonLogger() {
    }

   public static SingletonLogger getSL() {
        if(sl == null) {
            sl = new SingletonLogger();
        }
        return sl;
   }

    public void log(String text) {
        System.out.println(text);
    }

}
