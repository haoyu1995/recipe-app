package guru.springframework.recipeapp.service;

import guru.springframework.recipeapp.domain.Recipe;
import guru.springframework.recipeapp.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {



    RecipeServiceImpl recipeService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Mock
    RecipeRepository recipeRepository;

    @Test
    public void getRecipe() throws Exception{

        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipe();

        assertEquals(recipes.size(),1);
        verify(recipeRepository, times(1)).findAll();
    }

}