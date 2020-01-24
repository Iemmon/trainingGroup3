package classwork.bank.repository.implementation;

import classwork.bank.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserRepositoryImplTest {

    private UserRepositoryImpl userRepository;
    private final String EMAIL = "email@gmail.com";
    private final String PASSWORD = "Pa$$w0ro1";
    private User user;
    private User user1;

    @Before
    public void setup() {
        userRepository = new UserRepositoryImpl();
        user = User.builder()
                .withEmail(EMAIL)
                .withPassword(PASSWORD)
                .build();

        user1 = User.builder()
                .withEmail("useremail@gmail.com")
                .withPassword("User#Pass1")
                .build();
    }

    @Test
    public void testSaveUserMapShouldIncrease() {
        long initialNubOfUsers = userRepository.count();
        userRepository.save(user);
        assertEquals(userRepository.count(), initialNubOfUsers + 1);
    }

    @Test
    public void findByEmailShouldReturnUser() {
        userRepository.save(user);
        User foundUser = userRepository.findByEmail(EMAIL).get();
        assertEquals(user, foundUser);
    }

    @Test
    public void findByIdShouldReturnUser() {
        userRepository.save(user1);
        userRepository.save(user);

        long id = userRepository.count();
        assertEquals(user, userRepository.findById(id).get());
    }

    @Test
    public void findAllWhenPageIncorrectNumOfItemsIncorrect() {
        userRepository.save(user1);
        userRepository.save(user);

        List<User> listOfUsers = userRepository.findAll(3, 50);
        assertEquals(userRepository.count(), listOfUsers.size());
    }

    @Test
    public void findAllWhenPageCorrectItemsCorrect(){
        userRepository.save(user1);
        userRepository.save(user);

        List<User> listOfUsers = userRepository.findAll(0, 1);
        assertEquals(userRepository.count()-1, listOfUsers.size());
    }

    @Test
    public void testFindAll() {
    }

    @Test
    public void count() {
    }

    @Test
    public void update() {
    }

    @Test
    public void deleteById() {
    }
}