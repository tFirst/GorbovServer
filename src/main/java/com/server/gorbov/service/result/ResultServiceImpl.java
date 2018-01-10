package com.server.gorbov.service.result;

import com.server.gorbov.Codes;
import com.server.gorbov.common.state.StateMain;
import com.server.gorbov.common.state.StateResult;
import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;
import com.server.gorbov.repository.ResultRepository;
import com.server.gorbov.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    final UserRepository userRepository;
    final ResultRepository resultRepository;

    public ResultServiceImpl(UserRepository userRepository, ResultRepository resultRepository) {
        this.userRepository = userRepository;
        this.resultRepository = resultRepository;
    }

    @Override
    public StateMain findAllResults() {
        StateMain stateMain = new StateMain();

        List<Result> results = new ArrayList<>(resultRepository.findAll());

        List<StateResult> stateResults = new ArrayList<>();

        for (Result result : results) {
            stateResults.add(new StateResult(result, userRepository.findUserByUserId(result.getUserId())));
        }

        stateMain.setResults(stateResults);
        stateMain.setErrorCode(Codes.SUCCESS);

        return stateMain;
    }

    @Override
    public Result findResultByUserId(Integer userId) {
        return resultRepository.findResultByUserId(userId);
    }

    @Override
    public StateMain saveResult(User user, Result result) {
        StateMain stateMain = new StateMain();

        result.setUserId(user.getUserId());

        resultRepository.save(result);

        stateMain.setErrorCode(Codes.SUCCESS);
        stateMain.setUser(user);
        stateMain.setResult(result);

        return stateMain;
    }
}
