package pl.radoslawkarwacki.hmt.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "recipe_category")
public class RecipeCategory {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, name = "category_name")
    @NotBlank
    private String name;
}
