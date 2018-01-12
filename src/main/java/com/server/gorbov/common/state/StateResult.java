package com.server.gorbov.common.state;

import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@ToString
public class StateResult implements Serializable {

    public String userName;
    public Timestamp date;
    public Long resultTime;
    public Integer resultEvalAtt;
    public Integer resultEvalAttMis;

    public StateResult(Result result, User user) {
        this.userName = user.getName();
        this.date = result.getTestDate();
        this.resultTime = result.getResultTime();
        this.resultEvalAtt = result.getResultEvalAtt();
        this.resultEvalAttMis = result.getResultEvalAttMis();
    }
}
