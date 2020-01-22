package classwork.bank.repository;

import classwork.bank.domain.Account;

import java.util.*;

public class AccountRepositoryImpl implements AccountRepository {

    private final Map<Integer, Account> accountMap = new HashMap<>();

    @Override
    public void save(Account entity) {
        accountMap.put(entity.getId(), entity);
    }

    @Override
    public Optional<Account> findById(Integer id) {
        return Optional.ofNullable(accountMap.get(id));
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accountMap.values());
    }

    @Override
    public void update(Account entity) {
        save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        accountMap.remove(id);
    }
}
