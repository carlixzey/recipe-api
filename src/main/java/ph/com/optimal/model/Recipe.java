package ph.com.optimal.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ph.com.optimal.dto.requests.RecipeDetailsRequest;
import ph.com.optimal.enums.DifficultyType;
import ph.com.optimal.enums.MealType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_recipe")
	private Set<Ingredients> ingredients = new HashSet<Ingredients>();

	@Lob
	private String directions;

	@Lob
	private String nutrituionFacts;

	@Enumerated
	private MealType mealType;

	@Enumerated
	private DifficultyType difficultyType;

	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public static Recipe build(RecipeDetailsRequest recipeRequest) {
		return new Recipe(
				recipeRequest.getId(),
				recipeRequest.getName(),
				recipeRequest.getIngredients(),
				recipeRequest.getDirections(),
				recipeRequest.getNutritionFacts(),
				recipeRequest.getMealType(),
				recipeRequest.getDifficultyType(),
				recipeRequest.getCreatedAt(),
				recipeRequest.getUpdatedAt());
	}

}