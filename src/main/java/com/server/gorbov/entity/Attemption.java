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
@Table(name = "attemption")
public class Attemption {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Integer stage;
    private Integer stageTimeStart;
    private Integer stageTimeEnd;
    private Integer score;
}
