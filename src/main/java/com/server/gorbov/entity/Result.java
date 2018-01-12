package com.server.gorbov.entity;

import lombok.*;
import lombok.experimental.Builder;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "results")
public class Result implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "testDate")
    private Timestamp testDate;

    @Column(name = "resultTime")
    private Long resultTime;

    @Column(name = "resultEvalAtt")
    private Integer resultEvalAtt;

    @Column(name = "resultEvalAttMis")
    private Integer resultEvalAttMis;

    private Integer stage11Black;
    private Integer stage12Black;
    private Integer stage13Black;
    private Integer stage14Black;
    private Integer stage15Black;
    private Integer stage11BlackMistakes;
    private Integer stage12BlackMistakes;
    private Integer stage13BlackMistakes;
    private Integer stage14BlackMistakes;
    private Integer stage15BlackMistakes;
    private Integer stage11Red;
    private Integer stage12Red;
    private Integer stage13Red;
    private Integer stage14Red;
    private Integer stage15Red;
    private Integer stage11RedMistakes;
    private Integer stage12RedMistakes;
    private Integer stage13RedMistakes;
    private Integer stage14RedMistakes;
    private Integer stage15RedMistakes;
    private Integer stage21Black;
    private Integer stage22Black;
    private Integer stage23Black;
    private Integer stage24Black;
    private Integer stage25Black;
    private Integer stage21BlackMistakes;
    private Integer stage22BlackMistakes;
    private Integer stage23BlackMistakes;
    private Integer stage24BlackMistakes;
    private Integer stage25BlackMistakes;
    private Integer stage21Red;
    private Integer stage22Red;
    private Integer stage23Red;
    private Integer stage24Red;
    private Integer stage25Red;
    private Integer stage21RedMistakes;
    private Integer stage22RedMistakes;
    private Integer stage23RedMistakes;
    private Integer stage24RedMistakes;
    private Integer stage25RedMistakes;
}
