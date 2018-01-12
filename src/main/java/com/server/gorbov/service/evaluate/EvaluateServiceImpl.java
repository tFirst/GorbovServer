package com.server.gorbov.service.evaluate;

import com.server.gorbov.entity.Attemption;
import com.server.gorbov.entity.AttemptionMistakes;
import com.server.gorbov.entity.Result;
import com.server.gorbov.repository.AttemptionMistakesRepository;
import com.server.gorbov.repository.AttemptionRepository;
import com.server.gorbov.repository.ResultRepository;
import com.server.gorbov.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class EvaluateServiceImpl implements EvaluateService {

    final AttemptionRepository attemptionRepository;
    final AttemptionMistakesRepository attemptionMistakesRepository;
    final ResultRepository resultRepository;
    final UserRepository userRepository;

    public EvaluateServiceImpl(AttemptionRepository attemptionRepository,
                               AttemptionMistakesRepository attemptionMistakesRepository, ResultRepository resultRepository, UserRepository userRepository) {
        this.attemptionRepository = attemptionRepository;
        this.attemptionMistakesRepository = attemptionMistakesRepository;
        this.resultRepository = resultRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Integer getScoreByStageAndTime(Integer stage, Integer time) {
        return attemptionRepository
                .findAttemptionByStageAndStageTimeStartAfterAndStageTimeEndBefore(stage, time, time)
                .getScore();
    }

    @Override
    public Integer getScoreByMistakes(Integer mistakes) {
        return attemptionMistakesRepository
                .findAttemptionMistakesByMistakes(mistakes)
                .getScore();
    }

    @Override
    public Integer getEvaluateAttemption(Result result) {
        // оценка
        Integer evaluate;
        Integer MAX_SCORES = 442;

        List<Attemption> attemptions1 = attemptionRepository.findAllByStage(1);
        List<Attemption> attemptions2 = attemptionRepository.findAllByStage(2);
        List<Attemption> attemptions3 = attemptionRepository.findAllByStage(3);
        List<Attemption> attemptions4 = attemptionRepository.findAllByStage(4);
        List<Attemption> attemptions5 = attemptionRepository.findAllByStage(5);

        Integer stage11Scores = attemptions1
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage11Black() &&
                                a.getStageTimeEnd() >= result.getStage11Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage11Red() &&
                                a.getStageTimeEnd() >= result.getStage11Red())
                .collect(Collectors.toList())
                .get(0)
                .getScore();

        Integer stage12Scores = attemptions2
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage12Black() &&
                                a.getStageTimeEnd() >= result.getStage12Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage12Red() &&
                                        a.getStageTimeEnd() >= result.getStage12Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage13Scores = attemptions3
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage13Black() &&
                                a.getStageTimeEnd() >= result.getStage13Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage13Red() &&
                                        a.getStageTimeEnd() >= result.getStage13Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage14Scores = attemptions4
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage14Black() &&
                                a.getStageTimeEnd() >= result.getStage14Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage14Red() &&
                                        a.getStageTimeEnd() >= result.getStage14Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage15Scores = attemptions5
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage15Black() &&
                                a.getStageTimeEnd() >= result.getStage15Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage15Red() &&
                                        a.getStageTimeEnd() >= result.getStage15Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage21Scores = attemptions1
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage21Black() &&
                                a.getStageTimeEnd() >= result.getStage21Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage21Red() &&
                                        a.getStageTimeEnd() >= result.getStage21Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage22Scores = attemptions2
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage22Black() &&
                                a.getStageTimeEnd() >= result.getStage22Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage22Red() &&
                                        a.getStageTimeEnd() >= result.getStage22Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage23Scores = attemptions3
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage23Black() &&
                                a.getStageTimeEnd() >= result.getStage23Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage23Red() &&
                                        a.getStageTimeEnd() >= result.getStage23Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage24Scores = attemptions4
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage24Black() &&
                                a.getStageTimeEnd() >= result.getStage24Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage24Red() &&
                                        a.getStageTimeEnd() >= result.getStage24Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage25Scores = attemptions5
                .stream()
                .filter((a) ->
                        a.getStageTimeStart() <= result.getStage25Black() &&
                                a.getStageTimeEnd() >= result.getStage25Black())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                attemptions1
                        .stream()
                        .filter((a) ->
                                a.getStageTimeStart() <= result.getStage25Red() &&
                                        a.getStageTimeEnd() >= result.getStage25Red())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer sumScores = stage11Scores +
                stage12Scores +
                stage13Scores +
                stage14Scores +
                stage15Scores +
                stage21Scores +
                stage22Scores +
                stage23Scores +
                stage24Scores +
                stage25Scores;

        System.out.println("SUM: " + sumScores);

        evaluate = sumScores / MAX_SCORES;

        return evaluate;
    }

    @Override
    public Integer getEvaluateAttemptionMistakes(Result result) {
        // оценка
        Integer evaluate;
        Integer MAX_SCORES = 68;

        List<AttemptionMistakes> stage1 = attemptionMistakesRepository.findAllByStage(1);
        System.out.println(stage1);
        List<AttemptionMistakes> stage2 = attemptionMistakesRepository.findAllByStage(2);
        System.out.println(stage2);
        List<AttemptionMistakes> stage3 = attemptionMistakesRepository.findAllByStage(3);
        System.out.println(stage3);
        List<AttemptionMistakes> stage4 = attemptionMistakesRepository.findAllByStage(4);
        System.out.println(stage4);
        List<AttemptionMistakes> stage5 = attemptionMistakesRepository.findAllByStage(5);
        System.out.println(stage5);

        Integer stage11Scores = stage1
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage11BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage1
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage11RedMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore();

        Integer stage12Scores = stage2
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage12BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage2
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage12RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage13Scores = stage3
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage13BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage3
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage13RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage14Scores = stage4
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage14BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage4
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage14RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage15Scores = stage5
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage15BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage5
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage15RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage21Scores = stage1
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage21BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage1
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage21RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage22Scores = stage2
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage22BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage2
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage22RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage23Scores = stage3
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage23BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage3
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage23RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage24Scores = stage4
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage24BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage4
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage24RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer stage25Scores = stage5
                .stream()
                .filter((s) ->
                        s.getMistakes() == result.getStage25BlackMistakes())
                .collect(Collectors.toList())
                .get(0)
                .getScore() +
                stage5
                        .stream()
                        .filter((s) ->
                                s.getMistakes() == result.getStage25RedMistakes())
                        .collect(Collectors.toList())
                        .get(0)
                        .getScore();

        Integer sumScores = stage11Scores +
                stage12Scores +
                stage13Scores +
                stage14Scores +
                stage15Scores +
                stage21Scores +
                stage22Scores +
                stage23Scores +
                stage24Scores +
                stage25Scores;

        evaluate = (MAX_SCORES - sumScores) / MAX_SCORES;

        return evaluate;
    }
}
