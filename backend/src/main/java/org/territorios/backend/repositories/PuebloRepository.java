package org.territorios.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.territorios.backend.entities.Pueblo;

public interface PuebloRepository extends JpaRepository<Pueblo, Integer> {
}
