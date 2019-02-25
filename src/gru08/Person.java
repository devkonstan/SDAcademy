package gru08;

public class Person {

    private String name;
    private String lastName;
    private String login;
    private String password;

    Person(String name, String lastName, String login, String password) {
        this.name=name;
        this.lastName=lastName;
        this.login=login;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
