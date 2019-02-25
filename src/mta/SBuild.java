package mta;

public class SBuild {

    public static void main(String[] args) {
        String s = "a";
        StringBuilder sB = new StringBuilder(s);
        for (int i = 0; i < 10000; i++) {
            sB.append("a");
        }
        s = sB.toString();
        System.out.println(s);
    }
}

