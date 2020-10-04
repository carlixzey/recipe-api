package ph.com.optimal.dto.responses;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import lombok.Getter;
import ph.com.optimal.enums.DifficultyType;
import ph.com.optimal.enums.MealType;
import ph.com.optimal.model.Ingredients;
import ph.com.optimal.model.Recipe;

@Getter
public class RecipeSummaryDTO extends SuccessResponse {
	private final Long id;
	private final String name;
	private final Set<Ingredients> ingredients;
	private final String directions;
	private final String nutritionFacts;
	private final MealType mealType;
	private final DifficultyType difficultyType;
	private final LocalDateTime createdAt;
	private final LocalDateTime updatedAt;

	public RecipeSummaryDTO(Long id, String name,Set<Ingredients> ingredients, String directions, String nutritionFacts, MealType mealType,DifficultyType difficultyType, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.directions = directions;
		this.nutritionFacts = nutritionFacts;
		this.mealType = mealType;
		this.difficultyType = difficultyType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		
	}

	public static RecipeSummaryDTO build(Recipe recipe) {
		return new RecipeSummaryDTO(
				recipe.getId(),
				recipe.getName(),
				recipe.getIngredients(),
				recipe.getDirections(),
				recipe.getNutrituionFacts(),
				recipe.getMealType(),
				recipe.getDifficultyType(),
				recipe.getCreatedAt(),
				recipe.getUpdatedAt());
	}
}
