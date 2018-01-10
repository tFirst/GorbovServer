package com.server.gorbov.entity;


import lombok.*;
import lombok.experimental.Builder;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "results")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "testDate")
    private Timestamp testDate;

    @Column(name = "resultTime")
    private Double resultTime;

    @Column(name = "resultEval")
    private Integer resultEval;
}
