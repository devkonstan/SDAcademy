package paz27;

public class Inty {
    public static void main(String[] args) {
        int a=11;
        System.out.println(a);
        int b=4;
        System.out.println(b);

        a=b-(a-b);
        b=b+b-a;
        a=a+(b-a)/2;

        System.out.println(a);
        System.out.println(b);
    }
}
