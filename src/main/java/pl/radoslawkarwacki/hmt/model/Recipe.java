package pl.radoslawkarwacki.hmt.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "recipe_name")
    @NotBlank
    private String recipeName;

    @Min(0)
    private int kcal;

    @Min(0)
    private int portions;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_category_id")
    @NotNull
    private RecipeCategory recipeCategory;

}
