package net.springsecurity.SpringSecurityRoleBasedAuth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {
    //THIS IS A PUBLIC CONTROLLER
    @GetMapping("/message")
    public String message(){
        return "THIS IS A PUBLIC CONTROLLER ";
    }
}
