package classwork.bank.injector;

import classwork.bank.view.View;
import classwork.bank.domain.User;
import classwork.bank.repository.UserRepository;
import classwork.bank.repository.implementation.UserRepositoryImpl;
import classwork.bank.service.*;
import classwork.bank.service.validator.UserValidator;
import classwork.bank.service.validator.Validator;

public class ApplicationInjector {
    private static final ApplicationInjector INSTANCE = new ApplicationInjector();

    private static final Validator<User> USER_VALIDATOR = new UserValidator();

    private static final PasswordEncryption PASSWORD_ENCRYPTION = new PasswordEncryption();

    private static final UserRepository USER_REPOSITORY = new UserRepositoryImpl();

    private static final UserService USER_SERVICE = new UserServiceImpl(USER_REPOSITORY, PASSWORD_ENCRYPTION, USER_VALIDATOR);
    private static final View VIEW = new View();

    private ApplicationInjector() {
    }

    public static ApplicationInjector getInstance() {
        return INSTANCE;
    }

    public UserService getUserService(){
        return USER_SERVICE;
    }

    public View getView() {
        return VIEW;
    }

}
