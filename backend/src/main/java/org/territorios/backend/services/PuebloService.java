package org.territorios.backend.services;

import org.springframework.stereotype.Service;
import org.territorios.backend.entities.Pueblo;
import org.territorios.backend.repositories.PuebloRepository;

@Service
public class PuebloService {

    private final PuebloRepository puebloRepository;

    public PuebloService(PuebloRepository puebloRepository) {
        this.puebloRepository = puebloRepository;
    }

    public Pueblo guardarPueblo(Pueblo pueblo) {
        return puebloRepository.save(pueblo);
    }
}


