package com.server.gorbov.repository;

import com.server.gorbov.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Collection<User> findAll();

    User findUserById(Integer id);

    User findUserByName(String name);
}
