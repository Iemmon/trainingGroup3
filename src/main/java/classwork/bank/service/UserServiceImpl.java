package classwork.bank.service;

import classwork.bank.domain.User;
import classwork.bank.repository.Page;
import classwork.bank.repository.Pageable;
import classwork.bank.repository.UserRepository;
import classwork.bank.service.validator.Validator;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncryptor passwordEncriptor;
    private final Validator<User> userValidator;

    private static final int USERS_PER_PAGE = 5;

    public UserServiceImpl(UserRepository userRepository, PasswordEncryptor passwordEncriptor,
                           Validator<User> userValidator) {
        this.userRepository = userRepository;
        this.passwordEncriptor = passwordEncriptor;
        this.userValidator = userValidator;
    }

    @Override
    public boolean login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isPresent()) {
            String encryptPassword = passwordEncriptor.encrypt(password, user.get().getSalt());
            return user.get().getPassword().contentEquals(encryptPassword);
        }
        return false;
    }

    @Override
    public boolean register(User user){
        if(userValidator.validate(user) && !userRepository.findByEmail(user.getEmail()).isPresent()) {
                String encryptPassword = passwordEncriptor.encrypt(user.getPassword(), user.getSalt());
                user.setPassword(encryptPassword);
                userRepository.save(user);
                return true;
            }
        return false;
        }

    @Override
    public List<User> findAll(int page) {
        Pageable<User> users = userRepository.findAll(new Page(page, USERS_PER_PAGE));
        return null;
    }


}
