package net.springsecurity.SpringSecurityRoleBasedAuth.controllers;

import net.springsecurity.SpringSecurityRoleBasedAuth.models.Product;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/message")
    public String getMessage(){
        return "THIS IS ADMIN CONTROLLER";
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<Product> getAllProducts(){
        Random random = new Random();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Product product = new Product(random.nextInt(10000),"product :: " + i, random.nextInt(1000) );
            products.add(product);
        }
        return products;
    }
}
