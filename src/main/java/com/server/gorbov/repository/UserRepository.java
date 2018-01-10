package com.server.gorbov.repository;

import com.server.gorbov.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface UserRepository extends CrudRepository<User, Long> {

    Collection<User> findAll();

    User findUserByUserId(Integer id);

    User findUserByName(String name);
}
