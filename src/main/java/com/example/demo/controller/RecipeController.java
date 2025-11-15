package com.example.demo.controller;

import com.example.demo.model.Recipe;
import com.example.demo.service.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController
{
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {this.recipeService = recipeService;}

    @GetMapping
    public List<Recipe> getRecipes(@RequestParam(required = false) String category)
    {
        if (category != null)
        {
            return recipeService.getByCategory(category);
        }
        return recipeService.getAllRecipes();
    }

    @PostMapping
    public Recipe addRecipe(@RequestBody Recipe recipe)
    {
        return recipeService.addRecipe(recipe);
    }

    @GetMapping("/search")
    public List<Recipe> search(@RequestParam String keyword) {
        return recipeService.searchRecipes(keyword);
    }
}
