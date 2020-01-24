package classwork.bank.service;

import classwork.bank.domain.User;
import classwork.bank.repository.UserRepository;
import classwork.bank.service.validator.Validator;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
    private static final String ENCODED_PASSWORD = "encoded_password";
    private static final String PASSWORD = "password";
    private static final String USER_EMAIL = "user@gmail.com";
    private static final String INCORRECT_PASSWORD = "INCORRECT_PASSWORD";
    private static final String ENCODE_INCORRECT_PASSWORD = "encode_incorrect_password";

    private User USER = User.builder()
            .withEmail(USER_EMAIL)
            .withPassword(ENCODED_PASSWORD)
            .build();

    @Mock
    private UserRepository userRepository;
    @Mock
    private PasswordEncryption passwordEncryption;
    @Mock
    private Validator<User> userValidator;

    @InjectMocks
    private UserServiceImpl userService;

    @After
    public void resetMocks() {
        reset(userRepository, passwordEncryption, userValidator);
    }

    @Test
    public void userShouldLoginSuccessfully() {
        when(passwordEncryption.encrypt(eq(PASSWORD), anyString())).thenReturn(ENCODED_PASSWORD);
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.of(USER));

        final boolean isLogin = userService.login(USER_EMAIL, PASSWORD);

        assertTrue(isLogin);
        verify(passwordEncryption).encrypt(eq(PASSWORD), anyString());
        verify(userRepository).findByEmail(eq(USER_EMAIL));
        verifyZeroInteractions(userValidator);
    }

    @Test
    public void userShouldNotLoginAsThereIsNotUserWithSuchEmail() {
        when(passwordEncryption.encrypt(eq(PASSWORD), anyString())).thenReturn(ENCODED_PASSWORD);
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.empty());

        final boolean isLogin = userService.login(USER_EMAIL, PASSWORD);

        assertFalse(isLogin);
        verify(passwordEncryption, Mockito.times(0)).encrypt(eq(PASSWORD), anyString());
        verify(userRepository).findByEmail(eq(USER_EMAIL));
        verifyZeroInteractions(userValidator);
    }

    @Test
    public void userShouldNotLoginAsPasswordIsIncorrect() {
        when(passwordEncryption.encrypt(eq(INCORRECT_PASSWORD), anyString())).thenReturn(ENCODE_INCORRECT_PASSWORD);
        when(userRepository.findByEmail(eq(USER_EMAIL))).thenReturn(Optional.of(USER));

        final boolean isLogin = userService.login(USER_EMAIL, INCORRECT_PASSWORD);

        assertFalse(isLogin);
        verify(passwordEncryption).encrypt(eq(INCORRECT_PASSWORD), anyString());
        verify(userRepository).findByEmail(eq(USER_EMAIL));
        verifyZeroInteractions(userValidator);
    }

    @Test
    public void userShouldRegisterSuccessfully() {
        when(userValidator.validate(any(User.class))).thenReturn(true);
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.empty());
        doNothing().when(userRepository).save(any(User.class));

        final boolean actual = userService.register(USER);

        assertTrue(actual);
        verify(userValidator).validate(any(User.class));
        verify(userRepository).findByEmail(anyString());
        verify(userRepository).save(USER);
    }

    @Test
    public void userShouldNotRegisterWithInvalidPasswordOrEmail() {
        when(userValidator.validate(any(User.class))).thenReturn(false);

        final boolean isSignedUp = userService.register(USER);

        assertFalse(isSignedUp);
        verify(userRepository, times(0)).findByEmail((anyString()));
        verify(passwordEncryption, times(0)).encrypt(anyString(), anyString());
        verify(userRepository, times(0)).save(any(User.class));
    }

    @Test
    public void userShouldNotRegisterAsEmailIsAlreadyUsed() {
        when(userValidator.validate(any(User.class))).thenReturn(true);
        when(userRepository.findByEmail(anyString())).thenReturn(Optional.of(USER));
        doNothing().when(userRepository).save(any(User.class));

        userService.register(USER);

        verify(userRepository, times(0)).save(USER);
    }
}
