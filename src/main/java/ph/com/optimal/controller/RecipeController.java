package ph.com.optimal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.optimal.dto.requests.RecipeDetailsRequest;
import ph.com.optimal.dto.responses.AppResponse;
import ph.com.optimal.dto.responses.ErrorResponse;
import ph.com.optimal.dto.responses.RecipeDetailsResponse;
import ph.com.optimal.dto.responses.RecipeListResponse;
import ph.com.optimal.dto.responses.RecipeSummaryDTO;
import ph.com.optimal.model.Recipe;
import ph.com.optimal.service.RecipeService;

@RestController
@RequestMapping("/api/v1")
public class RecipeController {

	@Autowired
	private RecipeService service;
	
	@GetMapping("/recipes")
	public AppResponse getAllRecipes(){
		List<Recipe> recipes = service.getAllRecipes();
		return new RecipeListResponse(recipes);
	}
	
	@GetMapping("/recipes/{id}")
	public ResponseEntity<AppResponse> getRecipe(@PathVariable Long id) {
		Recipe recipe = this.service.getRecipe(id);
		if(recipe!=null) {
			return new ResponseEntity<> (new RecipeDetailsResponse(recipe, "Recipe "+id), HttpStatus.OK);
		}else {
			return new ResponseEntity<> (new ErrorResponse("Recipe Not Found"), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/recipes")
	public ResponseEntity<AppResponse> create(@Valid @RequestBody RecipeDetailsRequest recipeRequest){
		Recipe recipe = Recipe.build(recipeRequest);
		Recipe saveRecipe = service.saveRecipe(recipe);
		RecipeSummaryDTO response = RecipeSummaryDTO.build(saveRecipe);
		return new ResponseEntity<>(new RecipeDetailsResponse(response, "Recipe is created"), HttpStatus.CREATED);
	}
	
	
//	@PutMapping("/recipes/{id}")
//	public ResponseEntity<AppResponse> update(@PathVariable Long id, @RequestBody Recipe recipe){
//		return new ResponseEntity<>(new RecipeDetailsResponse(null, "Recipe is updated"), HttpStatus.NO_CONTENT);
//	}

	
	
	//
	//@getmapping
	//public AppResponse getAllRecipes(@RequestParam(value="page", defaultValue="1") int page,@RequestParam(value="page_size", defaultValue="1") int pageSize, HttpServletRequest request){
	// get all recipe in the service
	//  Page<Recipe> recipePage = service.getAllRecipe(getPageable(page, pageSize));
	//
	// //return using RecipeListResponse
	// return new RecipeListResponse(buildRecipeDTOs (recipePage);

}
