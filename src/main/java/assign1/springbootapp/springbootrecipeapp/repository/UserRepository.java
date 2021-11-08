/*********************************************************************************
 * Project: Recipe - SpringBoot App
 * Assignment: Assignment 1
 * Author(s): Trisha Conde
 * Student Number: 101252967
 * Date: Nov 7, 2021
 * Description: Interface that extends JPA Repository and supply our User type.
 *              It access the user's data from the database.
 **********************************************************************************/


package assign1.springbootapp.springbootrecipeapp.repository;

import assign1.springbootapp.springbootrecipeapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}