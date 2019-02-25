package mta;

public class Cat {
    public static final int LEGS_COUNT = 4;
    public static String DEFAULT_COLOR = "biały";

    private String name;
    private String color;

    public Cat(String name) {
        this.name = name;
        color = DEFAULT_COLOR;
    }
}
