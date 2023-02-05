package com.joselu_dani.supersaver.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        // Aquí debes implementar la lógica de autenticación
        // por ejemplo, consultando una base de datos o
        // utilizando Spring Security

        // En caso de éxito, agrega el usuario a la sesión
        session.setAttribute("user", username);

        return "redirect:/dashboard";
    }
}
