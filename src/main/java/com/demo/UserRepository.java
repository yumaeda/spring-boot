package com.demo;

import org.springframework.data.repository.CrudRepository;
import com.demo.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
