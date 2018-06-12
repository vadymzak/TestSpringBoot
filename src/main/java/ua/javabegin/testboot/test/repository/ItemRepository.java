package ua.javabegin.testboot.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.javabegin.testboot.test.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
