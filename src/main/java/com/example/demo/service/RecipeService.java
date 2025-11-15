package com.example.demo.service;

import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService
{

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) { this.recipeRepository = recipeRepository;}

    public List<Recipe> getAllRecipes() { return recipeRepository.findAll();}

    public Recipe addRecipe(Recipe recipe) { return recipeRepository.save(recipe);}

    public List<Recipe> searchRecipes(String keyword)
    {
        return recipeRepository
                .findByTitleContainingIgnoreCaseOrIngredientsContainingIgnoreCase(keyword, keyword);
    }

    public List<Recipe> getByCategory(String category)
    {
        return recipeRepository.findByCategoryIgnoreCase(category);
    }
}
