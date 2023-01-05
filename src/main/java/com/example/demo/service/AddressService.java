package com.example.demo.service;

import java.util.List;

import com.example.demo.shared.dto.AddressDTO;

public interface AddressService {

	List<AddressDTO> getAddresses(String userId);
	AddressDTO getAddress(String addressId);
	
}
