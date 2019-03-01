package lut09.advanced.users;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import lut10.main.java.pl.sda.advanced.users.Sex;
import lut10.main.java.pl.sda.advanced.users.User;
import lut10.main.java.pl.sda.advanced.users.UserInMemoryDatabase;
import lut10.main.java.pl.sda.advanced.users.UserService;
import lut10.main.java.pl.sda.advanced.users.UserAlreadyExistsExc;


import java.util.Optional;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

//Mock to taka wydmuszka

    @Mock
    private UserInMemoryDatabase baza; //mockujemy baze danych

//    @InjectMocks
    private UserService serwis; //nie mockujemy klasy, ktora testujemy

    @Before
    public void setUp() {
        baza = Mockito.mock(UserInMemoryDatabase.class);
        serwis = new UserService(baza);
    }

    //register test
    //jesli uzytkownik nie istnieje to moze byc dodany do bazy danych
    @Test
    public void userEmailShouldNotExist() {
        //given
        String email = "test@email.pl";
        when(baza.getByEmail(email)).thenReturn(Optional.empty());

        //when
        serwis.register("Jan", "123456", email, 20, Sex.FEMALE);

        //then
        verify(baza, times(1)).add(any());
    }

    @Test(expected = UserAlreadyExistsExc.class)
    public void userEmailExist() {
        //given
        String email = "test2@email.pl";
        User user = new User("Jan", "123456", email, 20, Sex.FEMALE);
        when(baza.getByEmail(email)).thenReturn(Optional.of(user)); //odnosie sie do powyzszego

        //when
        serwis.register("Jan", "123456", email, 20, Sex.FEMALE);

        //then
        verify(baza, times(1)).add(any());
    }
}

