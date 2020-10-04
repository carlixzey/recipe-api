package ph.com.optimal.dto.requests;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ph.com.optimal.enums.DifficultyType;
import ph.com.optimal.enums.MealType;
import ph.com.optimal.model.Ingredients;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDetailsRequest {

	private Long id;
	private String name;
	private Set<Ingredients> ingredients;
	private String directions;
	private String nutritionFacts;
	private MealType mealType;
	private DifficultyType difficultyType;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
