package ph.com.optimal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ph.com.optimal.model.Recipe;
import ph.com.optimal.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Autowired
	private RecipeRepository repository;

	@Override
	public List<Recipe> getAllRecipes() {
		return repository.findAll();
	}

	@Override
	public Recipe getRecipe(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Recipe saveRecipe(Recipe recipe) {
		return repository.save(recipe);
	}

//	@Override
//	public Recipe updateRecipe(Long id, Recipe newRecipe) {
//	}

	@Override
	public void deleteRecipe(Long id) {
		 repository.deleteById(id);
	}
}
