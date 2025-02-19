package org.territorios.backend.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.territorios.backend.entities.Pueblo;
import org.territorios.backend.services.PuebloService;

@RestController
@RequestMapping("/pueblos")
public class PuebloController {

    private final PuebloService puebloService;

    public PuebloController(PuebloService puebloService) {
        this.puebloService = puebloService;
    }

    @PostMapping("/añadir")
    public Pueblo agregarPueblo(@RequestBody Pueblo pueblo) {
        return puebloService.guardarPueblo(pueblo);
    }
}
