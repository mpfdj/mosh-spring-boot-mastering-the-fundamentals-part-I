package com.codewithmosh.store;

import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repositories.UserRepository;
import com.codewithmosh.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

//        var repository = context.getBean(UserRepository.class);
//
//        var userObj = User.builder()
//                .name("John Doe")
//                .email("john@gmail.com")
//                .password("password")
//                .build();
//
//        repository.save(userObj);
//
//
//        var user = repository.findById(1L).orElseThrow();
//        System.out.println(user.getEmail());
//
//        repository.findAll().forEach(u -> System.out.println(u.getEmail()));
//
//        repository.deleteById(1L);





        var service = context.getBean(UserService.class);
//        service.showEntityStates();
        service.showRelatedEntities();


    }

}
