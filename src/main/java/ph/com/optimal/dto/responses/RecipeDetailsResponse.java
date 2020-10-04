package ph.com.optimal.dto.responses;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ph.com.optimal.enums.DifficultyType;
import ph.com.optimal.enums.MealType;
import ph.com.optimal.model.Ingredients;
import ph.com.optimal.model.Recipe;

@Getter
@AllArgsConstructor
public class RecipeDetailsResponse extends SuccessResponse {
	
	private final Long id;
	private final String name;
	private final Set<Ingredients> ingredients;
	private final String directions;
	private final String nutritionFacts;
	private final MealType mealType;
	private final DifficultyType difficultyType;
	private final LocalDateTime createdAt;
	private final LocalDateTime updatedAt;
	
	public RecipeDetailsResponse(Recipe recipe, String message) {
		this(recipe.getId(),recipe.getName(), recipe.getIngredients(), recipe.getDirections(), recipe.getNutrituionFacts(), recipe.getMealType(), recipe.getDifficultyType(), recipe.getCreatedAt(), recipe.getUpdatedAt());
		addFullMessage(message);
	}
	
	public RecipeDetailsResponse(Recipe recipe){
		this(recipe, null);
	}

	
	public static RecipeDetailsResponse build(Recipe recipe) {
		return new RecipeDetailsResponse(recipe.getId(),recipe.getName(), recipe.getIngredients(), recipe.getDirections(), recipe.getNutrituionFacts(), recipe.getMealType(), recipe.getDifficultyType(), recipe.getCreatedAt(), recipe.getUpdatedAt());
	}

	public RecipeDetailsResponse(RecipeSummaryDTO response, String message) {
		this(response.getId(),response.getName(), response.getIngredients(), response.getDirections(), response.getNutritionFacts(), response.getMealType(), response.getDifficultyType(), response.getCreatedAt(), response.getUpdatedAt());
		addFullMessage(message);
		}
}
