package com.server.gorbov.common.state;

import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
public class StateResult {

    private String userName;
    private Timestamp date;
    private Double resultTime;
    private Integer resultEval;

    public StateResult(Result result, User user) {
        this.userName = user.getName();
        this.date = result.getTestDate();
        this.resultTime = result.getResultTime();
        this.resultEval = result.getResultEval();
    }
}
