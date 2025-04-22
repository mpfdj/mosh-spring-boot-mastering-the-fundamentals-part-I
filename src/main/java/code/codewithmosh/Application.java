package code.codewithmosh;

import code.codewithmosh.store.HeavyResource;
import code.codewithmosh.store.OrderService;
import code.codewithmosh.userregistrationservice.User;
import code.codewithmosh.userregistrationservice.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);


		var resource = context.getBean(HeavyResource.class);  // Lazy loaded


		var orderService = (OrderService) context.getBean("orderService");
		var orderService2 = (OrderService) context.getBean("orderService");
		orderService.placeOrder();

//		var notificationService = (NotificationService) context.getBean(NotificationService.class);
//		notificationService.send("This is a test.");




//		context.close();


		// ------------------------------------
		// User registration service
		// ------------------------------------

		User user1 = new User(1L, "john@gmail.com", "1234", "John Doe");
		User user2 = new User(1L, "john@gmail.com", "1234", "John Doe");


		UserService userService = (UserService) context.getBean("usr-UserService");
		userService.registerUser(user1);
		userService.registerUser(user2);
	}

}
