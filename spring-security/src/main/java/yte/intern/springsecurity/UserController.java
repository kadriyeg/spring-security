package yte.intern.springsecurity;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/name")
    public String getMyName() {
        return "Kadriye";
    }

    @GetMapping("/user")
    public String userLogin(){
        return "youre logged in";
    }



    @GetMapping("/userpage")
    public String userPage(){
        return "youre in user page";
    }

    @GetMapping("/adminpage")
    public String adminPage(){
        return "youre in admin page";
    }
}
