package classwork.bank.controller;

import classwork.bank.view.View;
import classwork.bank.domain.User;
import classwork.bank.injector.ApplicationInjector;
import classwork.bank.service.UserService;
import classwork.bank.utility.InputUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {
    private final ApplicationInjector injector = ApplicationInjector.getInstance();
    private final UserService userService = injector.getUserService();
    private final View view = injector.getView();

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public void run() {
        ResourceBundle bundle = chooseLanguage();
        view.print(bundle.getString("main-menu-option1") + "\n" +
                bundle.getString("main-menu-option2") + "\n" +
                bundle.getString("main-menu-option3") + "\n" +
                bundle.getString("main-menu-option4") + "\n"
        );
        do {
            switch (InputUtility.getValidMenuNumber(4)) {
                case 1:
                    String email;
                    String pass;
                    boolean isLoggedIn;
                    do {
                        view.print(bundle.getString("enter-email"));
                        email = InputUtility.getUserData();
                        view.print(bundle.getString("enter-password"));
                        pass = InputUtility.getUserData();
                        isLoggedIn = userService.login(email, pass);
                    } while (!isLoggedIn);
                    view.print(bundle.getString("login-success"));
                    break;
                case 2:
                    boolean isSignedUp;
                    do {
                        view.print(bundle.getString("enter-email"));
                        email = InputUtility.getUserData();
                        view.print(bundle.getString("enter-password"));
                        pass = InputUtility.getUserData();

                        final User user1 = User.builder()
                                .withEmail(email)
                                .withPassword(pass)
                                .withAccounts(null)
                                .build();
                        isSignedUp = userService.register(user1);
                        if (!isSignedUp) {
                            logger.info("registration failed");
                            view.print("Not regested");
                        } else view.print("successfully");
                    } while (!isSignedUp);
                    break;
                case 3:
                    //view info
                    break;
                case 4:
                    view.print(bundle.getString("exit"));
                    System.exit(0);
            }
        } while (true);
    }

    private ResourceBundle chooseLanguage() {
        Locale locale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("properties", locale);
        view.print(bundle.getString("choose-language-message"));
        int userInput = InputUtility.getValidMenuNumber(2);
        if (userInput == 1) {
            locale = new Locale("ru", "RU");
            bundle = ResourceBundle.getBundle("properties", locale);
        }
        return bundle;
    }
}
