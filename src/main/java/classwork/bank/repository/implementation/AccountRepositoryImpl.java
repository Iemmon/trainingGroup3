package classwork.bank.repository.implementation;

import classwork.bank.domain.Account;
import classwork.bank.repository.AccountRepository;
import classwork.bank.repository.Page;
import classwork.bank.repository.Pageable;

import java.util.*;

public class AccountRepositoryImpl implements AccountRepository {

    private final Map<Integer, Account> accountMap = new HashMap<>();

    @Override
    public void save(Account entity) {
        accountMap.put(entity.getId(), entity);
    }

    @Override
    public Optional<Account> findById(Long id) {
        return Optional.ofNullable(accountMap.get(id));
    }

    @Override
    public Pageable<Account> findAll(Page page) {
        return null;
    }

    @Override
    public List<Account> findAll(int page, int itemsPerPage) {
        return null;
    }

    @Override
    public long count() {
        return 0;
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
