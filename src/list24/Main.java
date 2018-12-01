package list24;

public class Main {
    public static void main(String[] args) {
        System.out.println("1234\rf5678");
        A b=new B(); //obiekt klasy A traktowany jak klasy B

        System.out.println(b instanceof B);

        A aprim=new A();
        System.out.println(aprim instanceof Object);
//       System.out.println(aprim instanceof main);
        System.out.println(aprim instanceof B);
        B bprim =(B) aprim;
        System.out.println(bprim);
    }
}
