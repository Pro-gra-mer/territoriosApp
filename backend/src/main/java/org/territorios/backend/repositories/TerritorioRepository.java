package org.territorios.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.territorios.backend.entities.Territorio;

public interface TerritorioRepository extends JpaRepository<Territorio, Integer> {
}
