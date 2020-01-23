package classwork.bank.repository;

import classwork.bank.domain.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User>{

    Optional<User> findByEmail(String email);

}
