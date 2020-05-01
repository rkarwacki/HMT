package pl.radoslawkarwacki.hmt.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.radoslawkarwacki.hmt.dto.RecipeDetailsDto;
import pl.radoslawkarwacki.hmt.mapper.RecipeMapper;
import pl.radoslawkarwacki.hmt.model.Ingredient;
import pl.radoslawkarwacki.hmt.model.RecipeStep;
import pl.radoslawkarwacki.hmt.service.IngredientService;
import pl.radoslawkarwacki.hmt.service.RecipeService;
import pl.radoslawkarwacki.hmt.service.RecipeStepService;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeFacadeImpl implements RecipeFacade {

    private RecipeMapper recipeMapper = RecipeMapper.INSTANCE;

    private RecipeService recipeService;
    private RecipeStepService recipeStepService;
    private IngredientService ingredientService;

    @Autowired
    public RecipeFacadeImpl(RecipeService recipeService, RecipeStepService recipeStepService, IngredientService ingredientService) {
        this.recipeService = recipeService;
        this.recipeStepService = recipeStepService;
        this.ingredientService = ingredientService;
    }

    @Override
    public Optional<RecipeDetailsDto> findByRecipeId(Long recipeId) {
        List<RecipeStep> recipeSteps = recipeStepService.findAllByRecipeId(recipeId);
        List<Ingredient> recipeIngredients = ingredientService.findAllByRecipeId(recipeId);
        return recipeService.findById(recipeId)
                .map(recipe -> recipeMapper.toRecipeDetailsDto(recipe, recipeSteps, recipeIngredients));
    }
}
