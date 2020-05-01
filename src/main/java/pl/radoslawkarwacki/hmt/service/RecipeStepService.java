package pl.radoslawkarwacki.hmt.service;

import pl.radoslawkarwacki.hmt.model.RecipeStep;

import java.util.List;

public interface RecipeStepService {

    List<RecipeStep> findAllByRecipeId(Long recipeId);
    List<RecipeStep> saveAll(List<RecipeStep> recipeSteps);

}
