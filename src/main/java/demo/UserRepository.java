package demo;

import org.springframework.data.repository.CrudRepository;
import demo.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
