package com.server.gorbov.repository;

import com.server.gorbov.entity.AttemptionMistakes;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface AttemptionMistakesRepository extends CrudRepository<AttemptionMistakes, Long> {

    Collection<AttemptionMistakes> findAll();

    AttemptionMistakes findAttemptionMistakesByMistakes(Integer mistakes);

    List<AttemptionMistakes> findAllByStage(Integer stage);
}
