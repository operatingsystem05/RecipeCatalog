package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ingredients;
    private String category;

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getTitle() { return title;}
    public void setTitle(String title) { this.title = title;}

    public String getIngredients() { return ingredients;}
    public void setIngredients(String ingredients) { this.ingredients = ingredients;}

    public String getCategory() { return category;}
    public void setCategory(String category) { this.category = category;}
}
