package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
