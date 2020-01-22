package classwork.bank.service;

import classwork.bank.domain.User;

public interface UserService {

    boolean login(String email, String password);
    User register(User user);
}
