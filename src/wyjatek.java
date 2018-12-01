

class MyChecked extends Exception {
}

class wyjatek {
    void someMethod(int i) throws MyChecked {
        if (i > 10) {
            throw new MyChecked();
        }
    }

    public static void main(String[] args) {
        wyjatek e = new wyjatek();
        //e.someMethod();

        try {
            e.someMethod(11);
        } catch (MyChecked dupa) {
            System.out.println("exception raised");
        }
    }
}

