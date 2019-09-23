package guru.springframework.recipeapp.service;

import guru.springframework.recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipe();
}
