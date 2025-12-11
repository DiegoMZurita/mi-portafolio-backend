package com.portafolio.mi_portafolio_backend.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm(@RequestParam(value = "error", required = false) String error,
                                @RequestParam(value = "logout", required = false) String logout,
                                Model model,
                                Authentication auth) {
        if(auth != null && auth.isAuthenticated()) {
            return "redirect:/education";
        }

        if(error != null) {
            model.addAttribute("error", "Usuario o contraseña incorrecta.");
        }

        if(logout != null) {
            model.addAttribute("logout", "Has cerrado sesión correctamente");
        }

        return "auth/form-login";
    }
}
