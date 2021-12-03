
/*********************************************************************************
 * Project: Recipe - SpringBoot App
 * Assignment: Assignment 1
 * Author(s): Lesya Klepak
 * Student Number: 101255738
 * Date: Nov 7, 2021
 * Description: Interface that takes the recipe’s information during create your own recipe,
 *              process it and store in the database.
 **********************************************************************************/

package assign1.springbootapp.springbootrecipeapp.services;

import assign1.springbootapp.springbootrecipeapp.dto.UserRegistrationDto;
import assign1.springbootapp.springbootrecipeapp.model.Recipe;


import java.util.List;

public interface RecipeService {
    Recipe save(UserRegistrationDto registrationDto);
    List<Recipe> getAll();
}
