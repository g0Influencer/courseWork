package com.example.cursach.Controllers;

import com.example.cursach.Models.Product;
import com.example.cursach.Models.User;
import com.example.cursach.Repositories.UserRepository;
import com.example.cursach.Service.ProductService;
import com.example.cursach.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @ModelAttribute("user")
    public User user() {
        return new User();
    }


    @GetMapping("/")
    public String index(Model model) {
        List<Product> products = productService.findAllProducts();

        model.addAttribute("products", products);
        return "index";
    }
    @GetMapping("/fiction")
    public String fiction(Model model) {
        List<Product> fiction = productService.findAllProducts();

        model.addAttribute("fiction",fiction);
        return "fiction";
    }
    @GetMapping("/foreign")
    public String foreign(Model model) {
        Iterable<Product> fiction = productService.findAllProducts();
        model.addAttribute("products",fiction);
        return "foreign";
    }
    @GetMapping("/!fiction")
    public String not_fiction(Model model) {
        List<Product> products = productService.findAllProducts();

        model.addAttribute("products",products);
        return "!fiction";
    }

    @GetMapping("/manga")
    public String manga(Model model) {
        Iterable<Product> fiction = productService.findAllProducts();
        model.addAttribute("products",fiction);
        return "manga";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/registration")
    public String getRegistration() {
        return "register";
    }

    @PostMapping("/registration")
    public String registerUserAccount(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/registration?success";
    }
}



