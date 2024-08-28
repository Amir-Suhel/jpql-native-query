package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Address;
import com.demo.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address addAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public List<Address> getAllAddresses() {
		return addressRepository.findAll();
	}

	@Override
	public String deleteAddres(Long id) {
		addressRepository.deleteById(id);
		return addressRepository.findById(id).get() != null ? "Deleted succesfully" : "something went wrong";

	}

}
