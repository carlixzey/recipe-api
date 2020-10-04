package ph.com.optimal.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ph.com.optimal.repository.RecipeRepository;

@ExtendWith(SpringExtension.class)
public class RecipeServiceTest {
	
	@InjectMocks
	private RecipeServiceImpl service;

	@Mock
	private RecipeRepository repository;
	
//	@Test
//	public void recipeService_testSave() {
//		Recipe recipe = new Recipe(1l, "Tropical Crepe Cake",Arrays.asList(new Ingredients()), "","", MealType.SNACK, DifficultyType.ADVANCE);
//		when(repository.saveAndFlush(recipe)).thenReturn(recipe);
//		Recipe expectedRecipe = service.saveRecipe(recipe);
//		assertThat(expectedRecipe.getName()).isEqualTo("Tropical Crepe Cake");
//	}
//	
//	@Test
//	public void recipeService_testGetOneRecipe() {
//		Recipe recipe = new Recipe(1l, "Tropical Crepe Cake",Arrays.asList(new Ingredients()), "","", MealType.SNACK, DifficultyType.ADVANCE);
//		when(repository.getOne(Mockito.anyLong())).thenReturn(recipe);
//		Recipe expectedRecipe = service.getRecipe(1l);
//		assertThat(expectedRecipe.getName()).isEqualTo("Tropical Crepe Cake").isNotEmpty();
//	}
//
//	@Test
//	public void recipeService_testGetAllRecipe() {
//		List<Recipe> recipes = Arrays.asList(
//				new Recipe(1l, "Tropical Crepe Cake",Arrays.asList(new Ingredients()), "","", MealType.SNACK, DifficultyType.ADVANCE),
//				new Recipe(2l, "Mexican Cake",Arrays.asList(new Ingredients()), "","", MealType.SNACK, DifficultyType.ADVANCE));
//		when(repository.findAll()).thenReturn(recipes);
//		List<Recipe> expectedRecipes =  service.getAllRecipes();
//		assertThat(expectedRecipes.size()).isEqualTo(2);
//	}
	
//	@Test
//	public void recipeService_testUpdateRecipe() {
//		Recipe recipe = new Recipe(1l, "Tropical Crepe Cake", MealType.SNACK);
//		when(repository.saveAndFlush(recipe)).thenReturn(recipe);
//		Recipe expectedRecipe = service.updateRecipe(1l, new Recipe(1l,"Cake", MealType.DINNER));
//		assertThat(expectedRecipe).isNotEqualTo(recipe);
//	}
	
//	@Test
//	public void recipeService_testDeleteRecipe() {
//		Recipe recipe = new Recipe(1l, "Tropical Crepe Cake", MealType.SNACK);
//		when(repository.saveAndFlush(recipe)).thenReturn(recipe);
//		service.deleteRecipe(Mockito.anyLong());
//	}
}