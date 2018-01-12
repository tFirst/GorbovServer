package com.server.gorbov.service.result;

import com.server.gorbov.Codes;
import com.server.gorbov.common.state.StateMain;
import com.server.gorbov.common.state.StateResult;
import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;
import com.server.gorbov.repository.ResultRepository;
import com.server.gorbov.repository.UserRepository;
import com.server.gorbov.service.evaluate.EvaluateService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResultServiceImpl implements ResultService {

    final UserRepository userRepository;
    final ResultRepository resultRepository;
    final EvaluateService evaluateService;

    public ResultServiceImpl(UserRepository userRepository,
                             ResultRepository resultRepository,
                             EvaluateService evaluateService) {
        this.userRepository = userRepository;
        this.resultRepository = resultRepository;
        this.evaluateService = evaluateService;
    }

    @Override
    public StateMain findAllResults() {
        StateMain stateMain = new StateMain();

        List<Result> results = new ArrayList<>(resultRepository.findAll());

        List<StateResult> stateResults = new ArrayList<>();

        for (Result result : results) {
            User user = userRepository.findUserByUserId(result.getUserId());
            stateResults.add(new StateResult(result, user));
        }

        stateMain.setResults(stateResults);
        stateMain.setErrorCode(Codes.SUCCESS);

        return stateMain;
    }

    @Override
    public StateMain findResultsByUserId(final Integer userId) {
        Collection<Result> allResults = resultRepository.findAll();
        List<StateResult> stateResults = new ArrayList<>();

        List<Result> userResults = allResults
                .stream()
                .filter((a) -> a.getUserId().equals(userId))
                .collect(Collectors.toList());

        for (Result result : userResults) {
            System.out.println(result.toString());
        }

        for (Result result : userResults) {
            User user = userRepository.findUserByUserId(userId);
            stateResults.add(new StateResult(result, user));
        }

        for (StateResult state : stateResults) {
            System.out.println(state.toString());
        }

        StateMain stateMain = new StateMain();
        stateMain.setErrorCode(Codes.SUCCESS);
        stateMain.setResults(stateResults);

        return stateMain;
    }

    @Override
    public StateMain saveResult(User user, Result result) {
        System.out.println(result);
        StateMain stateMain = new StateMain();

        result.setUserId(user.getUserId());
        result.setResultEvalAtt(evaluateService.getEvaluateAttemption(result) * 100);
        result.setResultEvalAttMis(evaluateService.getEvaluateAttemptionMistakes(result) * 100);

        resultRepository.save(result);

        stateMain.setErrorCode(Codes.SUCCESS);
        stateMain.setUser(user);

        return stateMain;
    }
}
