package com.demo.service;

import java.util.List;

import com.demo.entity.Address;

public interface AddressService {
	
	Address addAddress(Address address);
	
	List<Address> getAllAddresses();
	
	String deleteAddres(Long id);

}
