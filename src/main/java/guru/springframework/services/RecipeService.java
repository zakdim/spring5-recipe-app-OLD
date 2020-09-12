package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by dmitri on 2020-09-01.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
