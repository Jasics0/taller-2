package com.unillanos.taller2.services;

import com.unillanos.taller2.entities.EvaluationE;
import com.unillanos.taller2.repositories.jpa.EvaluationRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EvaluationService {

    private final EvaluationRepositoryJpa evaluationRepositoryJpa;

    public EvaluationE save(EvaluationE entity){
        return evaluationRepositoryJpa.save(entity);
    }
}
