package com.server.gorbov.entity;

import lombok.*;
import lombok.experimental.Builder;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "attemption_mistakes")
public class AttemptionMistakes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Integer stage;
    private Integer mistakes;
    private Integer score;
}