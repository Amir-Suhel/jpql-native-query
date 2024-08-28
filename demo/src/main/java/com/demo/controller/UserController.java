package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.entity.UserCityResponse;
import com.demo.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping("/name/{name}")
	public List<User> getAllByName(@PathVariable String name) {
		return userService.getAllByName(name);
	}

	@GetMapping("/city/{city}")
	public List<User> getAllByCity(@PathVariable String city) {
		return userService.getAllByCity(city);
	}

	@GetMapping("/department/{department}")
	public List<User> getAllByDepartment(@PathVariable String department) {
		return userService.getAllByDepartment(department);
	}

//	@GetMapping("/department/users")
//	public List<UserResponse> getTotalUserByDepartment() {
//		return userService.getTotalUserByDepartment();
//	}

	@GetMapping("/city/users")
	public List<UserCityResponse> getTotalUserByCity() {
		return userService.getTotalUserByCity();
	}
	
//	@GetMapping("/department/users/projection")
//	public List<UserResponseProjection> getTotalUserByDepartmentUsingProjection() {
//		return userService.getTotalUserByDepartmentUsingProjection();
//	}

}
