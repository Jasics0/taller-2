package com.unillanos.taller2.repositories.jpa;

import com.unillanos.taller2.entities.EvaluationE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepositoryJpa extends JpaRepository<EvaluationE, Long> {
}
