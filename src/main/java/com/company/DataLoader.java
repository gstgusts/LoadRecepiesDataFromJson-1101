package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DataLoader {
    public void load() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            var dataObject = mapper.readValue(new File("src/main/resources/data.json"), DataObject.class);

            var items = dataObject.getRecipes();

            for (var recipe: items
                 ) {
                addRecipeToDb(recipe);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void addRecipeToDb(Recepe recipe) {

        // add recipe to db

        // get id for recipe
        var recipeId = 0;

        for (var ing :
                recipe.getIngredients()) {

            addIngredientToDb(recipeId, ing);
        }


    }

    private void addIngredientToDb(int recipeId, Ingredient ing) {

        // insert ingredient into db
    }
}
