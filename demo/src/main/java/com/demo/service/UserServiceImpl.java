package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.entity.UserCityResponse;
import com.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllByName(String name) {
		return userRepository.findAllByName(name);
	}

	@Override
	public List<User> getAllByCity(String city) {
		return userRepository.findAllByCity(city);
	}

	@Override
	public List<User> getAllByDepartment(String department) {
		return userRepository.findAllByDepartment(department);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

//	@Override
//	public List<UserResponse> getTotalUserByDepartment() {
//		return userRepository.findTotalUserByDepartment();
//	}

	@Override
	public List<UserCityResponse> getTotalUserByCity() {
		return userRepository.findTotalUserByCity();
	}

//	@Override
//	public List<UserResponseProjection> getTotalUserByDepartmentUsingProjection() {
//		return userRepository.findTotalUserByDeparmentByProjection();
//	}

}
