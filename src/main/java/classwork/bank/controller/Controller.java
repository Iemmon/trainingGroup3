package classwork.bank.controller;

import classwork.bank.view.View;
import classwork.bank.domain.User;
import classwork.bank.injector.ApplicationInjector;
import classwork.bank.service.UserService;
import classwork.bank.utility.InputUtility;

import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {
    private final ApplicationInjector injector = ApplicationInjector.getInstance();
    private final UserService userService = injector.getUserService();
    private final View view = injector.getView();

    private Locale locale = Locale.getDefault();
    private ResourceBundle bundle = ResourceBundle.getBundle("properties", locale);

    public void run() {
        view.print(bundle.getString("choose-language-message"));
        int userInput = InputUtility.getValidMenuNumber(2);
        if (userInput == 1) {
            locale = new Locale("ru", "RU");
        }
        view.print(bundle.getString("main-menu-option1") + "\n" +
                bundle.getString("main-menu-option2") + "\n" +
                bundle.getString("main-menu-option3") + "\n" +
                bundle.getString("main-menu-option4") + "\n"
        );
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
                } while (isSignedUp);
                break;
            case 3:
                //view info
            case 4:
                view.print(bundle.getString("exit"));
                System.exit(0);
        }
    }
}
