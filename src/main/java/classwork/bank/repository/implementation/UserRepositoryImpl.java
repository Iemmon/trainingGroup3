package classwork.bank.repository.implementation;

import classwork.bank.domain.User;
import classwork.bank.repository.Page;
import classwork.bank.repository.Pageable;
import classwork.bank.repository.UserRepository;

import java.util.*;
import java.util.stream.Collectors;

public class UserRepositoryImpl implements UserRepository {

    private final Map<Long, User> userMap = new HashMap<>();
    private long idCounter = 1;

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
        //validate email
        return userMap.values()
                .stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userMap.get(id));
    }

    @Override
    public Pageable<User> findAll(Page page) {
        int maxPages = userMap.size() / page.getItemsPerPage() - 1;
        List<User> items = findAll(page.getPageNumber(), page.getItemsPerPage());
        return new Pageable<User>(items, page.getPageNumber(), page.getItemsPerPage(), maxPages);
    }

    @Override
    public List<User> findAll(int page, int itemsPerPage) {
        int maxPage = (userMap.size() - 1) / itemsPerPage;
        page = Math.max(page, 0);
        page = Math.min(page, maxPage);

        return userMap.values()
                .stream()
                .skip(page * itemsPerPage)
                .limit(itemsPerPage)
                .collect(Collectors.toList());
    }

    @Override
    public long count() {
        return userMap.size();
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
