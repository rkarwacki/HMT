package pl.radoslawkarwacki.hmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.radoslawkarwacki.hmt.dto.RecipeDetailsDto;
import pl.radoslawkarwacki.hmt.dto.RecipeDto;
import pl.radoslawkarwacki.hmt.facade.RecipeFacade;
import pl.radoslawkarwacki.hmt.mapper.RecipeMapper;
import pl.radoslawkarwacki.hmt.model.Recipe;
import pl.radoslawkarwacki.hmt.service.RecipeService;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private RecipeService recipeService;
    private RecipeFacade recipeFacade;

    private RecipeMapper recipeMapper = RecipeMapper.INSTANCE;

    @Autowired
    public RecipeController(RecipeService recipeService, RecipeFacade recipeFacade) {
        this.recipeService = recipeService;
        this.recipeFacade = recipeFacade;
    }

    @GetMapping
    public ResponseEntity<List<RecipeDto>> getAll() {
        List<RecipeDto> recipeDtos = recipeService.findAll().stream()
                .map(recipe -> recipeMapper.toRecipeDto(recipe))
                .collect(Collectors.toList());
        return new ResponseEntity<>(recipeDtos, HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<RecipeDto>> getAllByCategory(@PathVariable("id") Long recipeCategoryId) {
        List<RecipeDto> recipeDtos = recipeService.findAllByRecipeCategoryId(recipeCategoryId).stream()
                .map(recipe -> recipeMapper.toRecipeDto(recipe))
                .collect(Collectors.toList());
        return new ResponseEntity<>(recipeDtos, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<RecipeDto> update(@RequestBody RecipeDto recipeDto) {
        Recipe recipe = recipeMapper.toRecipe(recipeDto);
        Recipe savedEntity = recipeService.save(recipe);
        return new ResponseEntity<>(recipeMapper.toRecipeDto(savedEntity), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RecipeDto> create(@RequestBody RecipeDto recipeDto) {
        Recipe recipe = recipeMapper.toRecipe(recipeDto);
        Recipe savedEntity = recipeService.save(recipe);
        return new ResponseEntity<>(recipeMapper.toRecipeDto(savedEntity), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        recipeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecipeDetailsDto> getById(@PathVariable("id") Long id) {
        return recipeFacade.findByRecipeId(id)
                .map(recipe -> new ResponseEntity<>(recipe, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
