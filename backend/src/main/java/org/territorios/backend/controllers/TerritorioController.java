package org.territorios.backend.controllers;

import org.territorios.backend.entities.Territorio;
import org.territorios.backend.services.TerritorioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/territorios")
public class TerritorioController {

    private final TerritorioService territorioService;

    public TerritorioController(TerritorioService territorioService) {
        this.territorioService = territorioService;
    }

    @PostMapping("/añadir")
    public Territorio agregarTerritorio(@RequestBody Territorio territorio) {
        return territorioService.save(territorio);
    }
}
