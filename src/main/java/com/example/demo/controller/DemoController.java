package com.example.demo.controller;

import com.example.demo.repository.ActorRepository;
import com.example.demo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    private ActorService actorService;

    @Autowired
    public DemoController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/prueba")
    public String prueba(Model model) {
        return "prueba";
    }


    @GetMapping("/")
    public String demo(Model model) {
        model.addAttribute("mensaje", "¡Hola, bienvenido a la aplicación!");
        // Devuelve el nombre de la vista, por ejemplo, "hola.html" en src/main/resources/templates
        model.addAttribute("nombre", "Juan");
        return "hola";
    }

    @GetMapping("/hola")
    public String hola(Model model) {
        model.addAttribute("usuario","Pepe");
        return "nuevavista";
    }

}
