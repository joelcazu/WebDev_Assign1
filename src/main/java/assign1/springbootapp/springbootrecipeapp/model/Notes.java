
/*********************************************************************************
 * Project: Recipe - SpringBoot App
 * Assignment: Assignment 1
 * Author(s): Trisha Conde
 * Student Number: 101252967
 * Date: Nov 7, 2021
 * Description: Notes to include more information about each recipe
 * with your id.
 **********************************************************************************/


package assign1.springbootapp.springbootrecipeapp.model;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Notes {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}