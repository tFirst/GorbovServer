package com.server.gorbov.common.state;

import lombok.Setter;

import java.util.List;


@Setter
public class StateMain {

    private Integer errorCode;
    private List<StateResult> results;
}
