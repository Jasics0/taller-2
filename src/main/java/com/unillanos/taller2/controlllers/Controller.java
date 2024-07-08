package com.unillanos.taller2.controlllers;

import com.unillanos.taller2.entities.EvaluationE;
import com.unillanos.taller2.services.EvaluationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class Controller {

    private final EvaluationService evaluationService;

    @PostMapping
    public EvaluationE saveEvaluation(@RequestBody EvaluationE evaluation){
        return evaluationService.save(evaluation);
    }


}
