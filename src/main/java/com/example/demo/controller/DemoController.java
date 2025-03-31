package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/prueba")
    public String prueba(Model model) {
        return "prueba";
    }


    @GetMapping("/")
    public String demo(Model model) {
        model.addAttribute("mensaje", "¡Hola, bienvenido a la aplicación!");
        // Devuelve el nombre de la vista, por ejemplo, "hola.html" en src/main/resources/templates
        return "hola";
    }
}
