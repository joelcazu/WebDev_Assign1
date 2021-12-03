/*********************************************************************************
 * Project: Recipe - SpringBoot App
 * Assignment: Assignment 1
 * Author(s): Joel Santos
 * Student Number: 101276709
 * Date: Nov 7, 2021
 * Description: This file represents the user’s data with their role. It allows different
 * users like admin to access a particular set of resources in the application
 **********************************************************************************/



package assign1.springbootapp.springbootrecipeapp.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Role() {

    }

    public Role(String name){
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}