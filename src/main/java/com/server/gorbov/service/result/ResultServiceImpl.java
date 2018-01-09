package com.server.gorbov.service.result;

import com.server.gorbov.entity.Result;
import com.server.gorbov.repository.ResultRepository;
import com.server.gorbov.repository.UserRepository;

import java.util.Collection;

public class ResultServiceImpl implements ResultService {

    final UserRepository userRepository;
    final ResultRepository resultRepository;

    public ResultServiceImpl(UserRepository userRepository, ResultRepository resultRepository) {
        this.userRepository = userRepository;
        this.resultRepository = resultRepository;
    }

    @Override
    public Collection<Result> findAll() {
        return resultRepository.findAll();
    }

    @Override
    public Result findResultByUserId(Integer userId) {
        return resultRepository.findResultByUserId(userId);
    }
}
