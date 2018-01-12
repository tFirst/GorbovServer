package com.server.gorbov.service.evaluate;

import com.server.gorbov.entity.Result;

public interface EvaluateService {

    Integer getScoreByStageAndTime(Integer stage, Integer time);

    Integer getScoreByMistakes(Integer mistakes);

    Integer getEvaluateAttemption(Result result);

    Integer getEvaluateAttemptionMistakes(Result result);
}
