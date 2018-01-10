package com.server.gorbov.repository;

import com.server.gorbov.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Collection<Role> findAll();

    Role findRoleByRoleId(Integer id);
}
