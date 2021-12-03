/*********************************************************************************
 * Project: Recipe - SpringBoot App
 * Assignment: Assignment 1
 * Author(s): Lesya Klepak
 * Student Number: 101255738
 * Date: Nov 7, 2021
 * Description: Interface that extends JPA Repository and supply our Recipe type.
 *  *              It access the recipe's data from the database..
 **********************************************************************************/

package assign1.springbootapp.springbootrecipeapp.repository;

import assign1.springbootapp.springbootrecipeapp.model.Recipe;
import assign1.springbootapp.springbootrecipeapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    Recipe findById(String id);

}
