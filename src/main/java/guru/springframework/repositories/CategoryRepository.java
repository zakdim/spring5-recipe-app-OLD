package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dmitri on 2020-08-31.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
