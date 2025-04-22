package code.codewithmosh.userregistrationservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("usr-UserService")
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    // Or use @Bean instead see src/main/java/code/codewithmosh/store/AppConfig.java
    public UserService(@Qualifier("urs-InMemRepository") UserRepository userRepository, @Qualifier("urs-EmailService") NotificationService notificationService) {
//    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        String email = user.getEmail();
        if (userRepository.findByEmail(email) != null) {
            throw new IllegalArgumentException("User with email " + email + " already exists");
        }

        userRepository.save(user);
        notificationService.send("You registered successfully!", email);
    }

}
