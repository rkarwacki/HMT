package pl.radoslawkarwacki.hmt.facade;

import pl.radoslawkarwacki.hmt.dto.RecipeDetailsDto;

import java.util.Optional;

public interface RecipeFacade {
    Optional<RecipeDetailsDto> findByRecipeId(Long recipeId);
}
