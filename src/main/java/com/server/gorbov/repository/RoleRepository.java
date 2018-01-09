package com.server.gorbov.repository;

import com.server.gorbov.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Collection<Role> findAll();

    Role findRoleById(Integer id);

    Role findRoleByRole(String role);
}
