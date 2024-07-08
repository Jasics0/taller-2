package com.unillanos.taller2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "evaluations")
@Getter @Setter
public class EvaluationE {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_evaluation")
        private long id;

        @Column(name = "name")
        private String name;

        @Column(name = "identification")
        private String identification;

        @Column(name = "evaluation_date")
        private LocalDate evaluationDate;

        @Column(name = "file_name")
        private String fileName;

}
