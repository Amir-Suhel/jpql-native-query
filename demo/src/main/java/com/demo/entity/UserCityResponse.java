package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserCityResponse {

	private String city;
	private long totalUsers;
}
