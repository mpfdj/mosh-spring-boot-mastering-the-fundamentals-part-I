package code.codewithmosh.userregistrationservice;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("urs-InMemRepository")
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
        String email = user.getEmail();
        users.put(email, user);
    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email,null);
    }


}
