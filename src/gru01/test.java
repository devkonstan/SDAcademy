package gru01;

public class test {
    public static void main(String[] args) {
        String c="a";
        String a="aba";
        String b="ab"+c;

        if(a.equals(b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
