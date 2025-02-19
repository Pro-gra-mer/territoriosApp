
package org.territorios.backend.services;

import org.springframework.stereotype.Service;
import org.territorios.backend.entities.Territorio;
import org.territorios.backend.repositories.TerritorioRepository;

@Service
public class TerritorioService {

    private final TerritorioRepository territorioRepository;

    public TerritorioService(TerritorioRepository territorioRepository) {
        this.territorioRepository = territorioRepository;
    }

    public Territorio guardarTerritorio(Territorio territorio) {
        return territorioRepository.save(territorio);
    }
}


