package com.codewithmosh.store.services;

import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repositories.ProfileRepository;
import com.codewithmosh.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityStates() {
        var user = User.builder()
                .name("John Doe")
                .email("john@gmail.com")
                .password("password")
                .build();

        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient or Detached");
        }



        userRepository.save(user);



        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient or Detached");
        }
    }



    @Transactional
    public void showRelatedEntities() {
//        var user = userRepository.findById(7L).orElseThrow();
//        System.out.println(user.getEmail());

        var profile = profileRepository.findById(7L).orElseThrow();
//        System.out.println(profile.getBio());
        System.out.println(profile.getUser().getEmail());
    }


}
