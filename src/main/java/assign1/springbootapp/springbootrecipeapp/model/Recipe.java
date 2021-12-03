
/*********************************************************************************
 * Project: Recipe - SpringBoot App
 * Assignment: Assignment 1
 * Author(s): Joel Santos
 * Student Number: 101276709
 * Date: Nov 7, 2021
 * Description: to map with the corresponding recipe table in the database and to allow
 public include ingredients,description and direction to the recipe.
 **********************************************************************************/


package assign1.springbootapp.springbootrecipeapp.model;

import javax.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private String ingredient;
    private String direction;



    public Recipe() {
   }
//    @ManyToOne
//    private Recipe publisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recipe recipe = (Recipe) o;

        return id != null ? id.equals(recipe.id) : recipe.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }


}