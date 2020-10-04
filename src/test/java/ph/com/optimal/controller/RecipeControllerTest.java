package ph.com.optimal.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import ph.com.optimal.model.Recipe;
import ph.com.optimal.service.RecipeService;

@WebMvcTest(RecipeController.class)
public class RecipeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private RecipeService service;
	
//	@Test
//	public void recipeController_testGetMethodReturnAllRecipe() throws Exception {
//		List<Recipe> recipes = Arrays.asList(new Recipe(1l,"Tropical Crepe Cake"), new Recipe(2l, "Mexican Pizza"));
//		when(service.getAllRecipes()).thenReturn(recipes);
//		RequestBuilder requestBuilder = MockMvcRequestBuilders
//				.get("/recipes")
//				.accept(MediaType.APPLICATION_JSON);
//		mockMvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().json("[{\"id\":1, \"name\":\"Tropical Crepe Cake\"},{\"id\":2, \"name\":\"Mexican Pizza\"}]")).andReturn();
//	}
//	
//	@Test
//	public void recipeController_testGetMethodReturn() throws Exception {
//		Recipe recipe = new Recipe(1l, "Tropical Crepe Cake");
//		when(service.getRecipe(1l)).thenReturn(recipe);
//		RequestBuilder requestBuilder = MockMvcRequestBuilders
//				.get("/recipe/1")
//				.accept(MediaType.APPLICATION_JSON);
//		mockMvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().json("{\"id\":1, \"name\":\"Tropical Crepe Cake\"}")).andReturn();
//	}
	
	@Test
	public void recipeController_testPostMethod() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/save")
				.accept(MediaType.APPLICATION_JSON)
				.content("{\"id\":1, \"name\":\"Tropical Crepe Cake\"}")
				.contentType(MediaType.APPLICATION_JSON);
		mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
	}
}
