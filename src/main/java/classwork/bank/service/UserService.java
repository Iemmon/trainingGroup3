package classwork.bank.service;

import classwork.bank.domain.User;

import java.util.List;

public interface UserService {

    boolean login(String email, String password);
    boolean register(User user);

    List<User> findAll(int page);
}
