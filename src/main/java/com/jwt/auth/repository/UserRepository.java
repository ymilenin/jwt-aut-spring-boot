package com.jwt.auth.repository;

import com.jwt.auth.model.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select distinct u from User u left join fetch u.roles where u.email = ?1")
    Optional<User> findByEmailFetchRoles(String email);

}
