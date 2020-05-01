package pl.radoslawkarwacki.hmt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RecipeDetailsDto {

    private Long id;
    private String name;
    private int kcal;
    @JsonProperty("category")
    private RecipeCategoryDto recipeCategoryDto;
    private List<RecipeStepDto> steps;
    private List<IngredientDto> ingredients;
}
