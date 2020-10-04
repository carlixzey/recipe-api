package ph.com.optimal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ph.com.optimal.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
