package classwork.bank;

import classwork.bank.domain.User;
import classwork.bank.injector.ApplicationInjector;
import classwork.bank.service.UserService;

public class ConsoleApp {

    public static void main(String[] args) {
        ApplicationInjector appInj = ApplicationInjector.getInstance();

        final User user1 = User.builder()
                .withEmail("email@gmail.com")
                .withPassword("password")
                .withAccounts(null)
                .build();

        final User user2 = User.builder()
                .withEmail("14134134")
                .withPassword("qwerty")
                .withAccounts(null)
                .build();

        final UserService userService = appInj.getUserService();
        userService.register(user1);
        userService.register(user2);

        final boolean password = userService.login("email@gmail.com", "sdkhsdl");
        System.out.println(password);

    }
}
