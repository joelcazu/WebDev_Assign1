/*********************************************************************************
 * Project: Recipe - SpringBoot App
 * Assignment: Assignment 1
 * Author(s): Lesya Klepak
 * Student Number: 101255738
 * Date: Nov 7, 2021
 * Description: Interface that takes the user’s information during registration,
 *              process it and store in the database.
 **********************************************************************************/


package assign1.springbootapp.springbootrecipeapp.services;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;
import assign1.springbootapp.springbootrecipeapp.dto.UserRegistrationDto;
import assign1.springbootapp.springbootrecipeapp.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    List<User> getAll();
}
