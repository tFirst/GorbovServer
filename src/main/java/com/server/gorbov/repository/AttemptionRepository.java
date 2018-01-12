package com.server.gorbov.repository;

import com.server.gorbov.entity.Attemption;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface AttemptionRepository extends CrudRepository<Attemption, Long> {

    Collection<Attemption> findAll();

    Attemption findAttemptionByStageAndStageTimeStartAfterAndStageTimeEndBefore(Integer stage, Integer after, Integer before);

    List<Attemption> findAllByStage(Integer stage);
}
