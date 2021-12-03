/*********************************************************************************
 * Project: Recipe - SpringBoot App
 * Assignment: Assignment 1
 * Author(s): Trisha Conde
 * Student Number: 101252967
 * Date: Nov 7, 2021
 * Description: it validates incoming data and representation layer that responds to
 http requests from registration page.
 **********************************************************************************/



package assign1.springbootapp.springbootrecipeapp.controllers;

import assign1.springbootapp.springbootrecipeapp.dto.UserRegistrationDto;
import assign1.springbootapp.springbootrecipeapp.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")
                                              UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}
