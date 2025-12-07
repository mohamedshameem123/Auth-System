package com.example.jwtauthdemo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping("/user/profile")
    public String profile() {
        return "This is USER profile – valid JWT token verified ✅";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "Welcome ADMIN – JWT + role verified ✅";
    }
}
