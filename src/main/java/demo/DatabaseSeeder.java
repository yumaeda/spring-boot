package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import demo.User;
import demo.UserRepository;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private final UserRepository repository;

    @Autowired
    public DatabaseSeeder(UserRepository repository) {
	this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        User user1 = new User();
        user1.setName("Iuke Vetzy");
        user1.setEmail("yukkylx@hotmail.com");
        this.repository.save(user1);

        User user2 = new User();
        user2.setName("Yukitaka Maeda");
        user2.setEmail("yumaeda@gmail.com");
        this.repository.save(user2);

        User user3 = new User();
        user3.setName("React Maniac");
        user3.setEmail("react_react_react@maniac.jp");
        this.repository.save(user3);
    }
}
