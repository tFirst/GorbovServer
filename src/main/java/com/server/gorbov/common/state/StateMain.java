package com.server.gorbov.common.state;

import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Setter
@ToString
public class StateMain {

    private Integer errorCode;
    private List<StateResult> results;
    private User user;
    private Result result;
}
