package classwork.bank.repository;

import classwork.bank.domain.User;

import java.util.*;


public class UserRepositoryImpl implements UserRepository {

    private int idCounter = 1;
    private final Map<Integer, User> userMap = new HashMap<>();


    @Override
    public void save(User entity) {
        if (entity.getId() == null) {
            entity.setId(idCounter);
            idCounter++;
        }
        userMap.put(entity.getId(), entity);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userMap.values()
                .stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.ofNullable(userMap.get(id));
    }

    @Override
    public List<User> findAll() {
            return new ArrayList<>(userMap.values());
    }

    @Override
    public void update(User entity) {
        if (!userMap.containsKey(entity.getId())) {
            throw new NoSuchElementException();
        }
        userMap.put(entity.getId(), entity);
    }

    @Override
    public void deleteById(Integer id) {
        userMap.remove(id);
    }

}
