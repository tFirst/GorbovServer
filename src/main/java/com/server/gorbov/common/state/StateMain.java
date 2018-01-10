package com.server.gorbov.common.state;

import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StateMain {

    private Integer errorCode;
    private List<StateResult> results;
    private User user;
    private Result result;

    @Override
    public String toString() {
        return "StateMain{" +
                "errorCode=" + errorCode +
                ", results=" + results +
                ", user=" + (user != null ? user.toString() : user) +
                ", result=" + (result != null ? result.toString() : result) +
                '}';
    }
}
