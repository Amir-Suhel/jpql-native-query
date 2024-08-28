package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Address;
import com.demo.service.AddressService;

@RestController
@RequestMapping("api/v1/addresses")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping
	public Address addAddress(@RequestBody Address address) {
		return addressService.addAddress(address);
	}
	
	@GetMapping
	public List<Address> getAll() {
		return addressService.getAllAddresses();
	}
	
	@DeleteMapping("/{id}")
	public String addAddress(@PathVariable Long id) {
		return addressService.deleteAddres(id);
	}
	
	

}
