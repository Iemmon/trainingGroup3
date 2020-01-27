package classwork.bank.dao;

import classwork.bank.domain.User;
import classwork.bank.repository.Page;
import classwork.bank.repository.Pageable;
import classwork.bank.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserDAOImpl implements UserRepository {
    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public void save(User entity) {

    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Pageable<User> findAll(Page page) {
        return null;
    }

    @Override
    public List<User> findAll(int page, int itemsPerPage) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
