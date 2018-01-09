package com.server.gorbov.service.result;

import com.server.gorbov.entity.Result;

import java.util.Collection;

public interface ResultService {

    Collection<Result> findAll();

    Result findResultByUserId(Integer userId);
}
