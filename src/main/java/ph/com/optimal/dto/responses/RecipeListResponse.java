package ph.com.optimal.dto.responses;

import java.util.Collection;

import lombok.Getter;
import ph.com.optimal.model.Recipe;

@Getter
public class RecipeListResponse extends SuccessResponse {
	
	private final Collection<Recipe> recipes;
	
	public RecipeListResponse(Collection<Recipe> recipes) {
		this.recipes = recipes;
	}
}
