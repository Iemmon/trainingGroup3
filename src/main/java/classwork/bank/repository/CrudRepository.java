package classwork.bank.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<E> {
    void save(E entity);

    Optional<E> findById(Long id);

    Pageable<E> findAll(Page page);

    List<E> findAll(int page, int itemsPerPage);

    long count();

    void update(E entity);

    void deleteById(Integer id);
}
