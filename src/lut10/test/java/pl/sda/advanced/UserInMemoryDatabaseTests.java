package lut10.test.java.pl.sda.advanced;

import lut10.main.java.pl.sda.advanced.users.Sex;
import lut10.main.java.pl.sda.advanced.users.User;
import lut10.main.java.pl.sda.advanced.users.UserInMemoryDatabase;
import org.junit.Before;
import org.junit.Test;
import sun.plugin.dom.exception.InvalidStateException;

import java.util.UUID;

import static org.junit.Assert.*;

public class UserInMemoryDatabaseTests {

    // private User user;
    // private Sex sex;
    private UserInMemoryDatabase users;

    @Before //tworzy instancje klasy users dla kolejnych testów
    public void setUp() {
        users = new UserInMemoryDatabase();
    }

    @Test
    public void addingUserShouldIncrementNumOfUsers() {
        // Given
        User user = new User("Jan", "Kowalski", "jan.kowalski@poczta.pl", 25, Sex.MALE);

        // When
        users.add(user);

        // Then
        assertEquals(1, users.getUsersCount());
    }

    @Test
    public void addingUserShouldNotIncrementNumOfUsers() {
        // Given
        User user = new User("Jan", "Kowalski", "jan.kowalski@poczta.pl", 25, Sex.MALE);

        // When
        users.add(user);

        // Then
        assertNotEquals(2, users.getUsersCount());
        assertFalse(users.getUsersCount() != 1);
    }

    @Test
    public void addingUserShouldNotBePossibleWhenTheUserIsNull() {
        // Given
        User user = null;

        // When
        users.add(user);

        // Then
        assertEquals(0, users.getUsersCount());

    }

    // test dla unikalnosci uzytkownika
    @Test
    public void id() {
        // Given

        // When

        // Then
    }


    @Test
    public void getByIdShouldReturnGivenUserByItsId() {
        // Given
        User user = new User("Jan", "Kowalski", "jan.kowalski@poczta.pl", 25, Sex.MALE);
        users.add(user);

        // When
        User givenUser = users.getById(user.getId());

        // Then
        assertSame(user, givenUser); //givenUser == user
        assertEquals(user.getId(), givenUser.getId());

    }

    @Test(expected = InvalidStateException.class)
    public void ifThereisNoUserWithGivenIdExceptionShouldBeThrown() {
        // Given
        User user = new User("Jan", "Kowalski", "jan.kowalski@poczta.pl", 25, Sex.MALE);
        users.add(user);


        // When
        User givenUser = users.getById(UUID.randomUUID());

        // Then
        assertNull(givenUser);

    }

    @Test
    public void inMemoryDatabaseShouldInitiallyBeEmpty() {
        // When
        int currentUsersCount = users.getUsersCount();

        // Then
        assertEquals(0, currentUsersCount);
        assertFalse(users.getUsersCount() != 0);

    }
}