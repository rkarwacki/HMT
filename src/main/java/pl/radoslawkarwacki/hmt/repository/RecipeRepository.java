package pl.radoslawkarwacki.hmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.radoslawkarwacki.hmt.model.Recipe;

import java.util.List;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    List<Recipe> findAllByRecipeCategoryId(Long recipeCategoryId);
}