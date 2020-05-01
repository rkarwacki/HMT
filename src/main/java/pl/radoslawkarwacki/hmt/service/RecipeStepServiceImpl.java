package pl.radoslawkarwacki.hmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.radoslawkarwacki.hmt.model.RecipeStep;
import pl.radoslawkarwacki.hmt.repository.RecipeStepRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeStepServiceImpl implements RecipeStepService {

    private RecipeStepRepository recipeStepRepository;

    @Autowired
    public RecipeStepServiceImpl(RecipeStepRepository recipeStepRepository) {
        this.recipeStepRepository = recipeStepRepository;
    }

    @Override
    public List<RecipeStep> findAllByRecipeId(Long recipeId) {
        return recipeStepRepository.findAllByRecipeId(recipeId).stream()
                .sorted(Comparator.comparing(RecipeStep::getStepNumber))
                .collect(Collectors.toList());
    }

    @Override
    public List<RecipeStep> saveAll(List<RecipeStep> recipeSteps) {
        return null;
    }
}
