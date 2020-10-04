package ph.com.optimal.service;

import java.util.List;

import ph.com.optimal.model.Recipe;

public interface RecipeService {

	public List<Recipe> getAllRecipes();
	
	public Recipe getRecipe(Long id);
	
	public Recipe saveRecipe(Recipe recipe);
	
	//public Recipe updateRecipe(Long id, Recipe recipe);
	
	public void deleteRecipe(Long id);
}
