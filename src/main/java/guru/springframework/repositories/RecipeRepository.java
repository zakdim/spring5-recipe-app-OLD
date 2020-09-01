package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dmitri on 2020-08-31.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
