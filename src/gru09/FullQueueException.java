package gru09;

public class FullQueueException extends Throwable {

    public FullQueueException(String message) {
        super(message); //dzieki temu pokaze msg z klasy Shop
        System.out.println("za duzo ludzi!!!");
    }
}
