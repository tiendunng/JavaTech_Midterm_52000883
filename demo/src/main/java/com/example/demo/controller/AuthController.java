package com.example.demo.controller;


import com.example.demo.dto.ProductDto;
import com.example.demo.dto.UserDto;
import com.example.demo.module.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@Service
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService service;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    ////     handler method to handle home page request
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewHomePage(Model model) {
        System.out.println("000000000000000000");
        List<ProductDto> listProducts = service.findAllProduct();
        model.addAttribute("listProducts", listProducts);

        return "index";
    }

    // handler method to handle user registration form request
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        // create model object to store form data
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "login/register";
    }

    // handler method to handle user registration form submit request
    @RequestMapping(value = "/register/save", method = RequestMethod.POST)
    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               Model model) {
        User existingUser = userService.findByEmail(userDto.getEmail());

        if (existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()) {
            result.rejectValue("email", null,
                    "There is already an account registered with the same email");
        }

        if (result.hasErrors()) {
            model.addAttribute("user", userDto);
            return "login/register";
        }

        userService.saveUser(userDto);
        return "redirect:/register?success";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listRegisteredUsers(Model model) {
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "displayRegister";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login/login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "redirect:/index";
    }



}