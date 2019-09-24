package guru.springframework.recipeapp.service;

import guru.springframework.recipeapp.commands.RecipeCommand;
import guru.springframework.recipeapp.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipe();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
    RecipeCommand findCommandById(Long l);
    void deleteById(Long idToDelete);
}
