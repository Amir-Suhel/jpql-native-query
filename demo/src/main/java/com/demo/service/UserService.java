package com.demo.service;

import java.util.List;

import com.demo.entity.User;
import com.demo.entity.UserCityResponse;

public interface UserService {

	User addUser(User user);

	List<User> getAllUser();

	List<User> getAllByName(String name);

	List<User> getAllByCity(String city);

	List<User> getAllByDepartment(String department);

	//List<UserResponse> getTotalUserByDepartment();

	List<UserCityResponse> getTotalUserByCity();
	
	//List<UserResponseProjection>getTotalUserByDepartmentUsingProjection();

}
