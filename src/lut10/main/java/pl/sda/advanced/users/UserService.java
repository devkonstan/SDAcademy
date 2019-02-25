package lut10.main.java.pl.sda.advanced.users;

public class UserService {
    private final UserInMemoryDatabase userDatabase;

    public UserService(UserInMemoryDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    // register
    public void register(String name, String password, String email, int age, Sex sex) {
        User user = userDatabase.getByEmail(email).orElse(null);
        //jezeli user istnieje czyli != null
        if (user != null) {
            throw new UserAlreadyExistsExc("user with " + email + " exists!");
        }

        User newuser = new User(name, password, email,age,sex);
        userDatabase.add(newuser);
    }

    // login
    public void login(String email, String password) {
        User user = userDatabase.getByEmail(email).orElse(null);

        if (user == null || user.getPassword().equals(password)) {
            throw new UserAlreadyExistsExc("Invalid credentials");
        }
    }
}

