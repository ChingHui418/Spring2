package tw.hui.spring2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.hui.spring2.dto.User;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@RequestMapping("/test1")
	public void test1() {
//		User user = User.builder().id(15).name("Hui").gender(true).build();
		User user = new User();
		user.setId(16);
		user.setName("Jenny");
		user.setGender(false);
		System.out.println(user);
		
	}
}
