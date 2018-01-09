package com.server.gorbov.repository;

import com.server.gorbov.entity.Result;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ResultRepository extends CrudRepository<Result, Long> {

    Collection<Result> findAll();

    Result findResultById(Integer id);

    Result findResByUserId(Integer userId);
}
