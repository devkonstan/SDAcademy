package lut16.pl.sda.behavioral.strategy_sample;

public class Calculus {
    private int currentNumber;
    private Aggregator aggregator;

    public Calculus(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public void execute(int number) {
        currentNumber = aggregator.execute(currentNumber, number);
    }

    public void setAggregator(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }
}
