import java.io.FileNotFoundException;

public class wyjatek2 {
    static void method() throws FileNotFoundException {
        System.out.println("may throw something");
    }

    static void anotherMethod() throws FileNotFoundException {
        method();
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            System.out.println("exception");
        }
    }
}
