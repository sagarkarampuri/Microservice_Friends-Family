package com.ms.ffd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.ffd.dto.FriendFamilyDTO;
import com.ms.ffd.exception.FriendAndFamilyException;
import com.ms.ffd.service.FriendAndFamilyService;

@RestController
public class FriendAndFamilyServiceController {

	@Autowired
	private FriendAndFamilyService friendAndFamilyService;

	@GetMapping("/friendandfamily/{id}")
	public ResponseEntity<FriendFamilyDTO> getFriendFamilyById(@PathVariable("id") int id)
			throws FriendAndFamilyException {
		return new ResponseEntity<>(friendAndFamilyService.getFriendFamilyById(id), HttpStatus.OK);
	}

	@GetMapping("/customers/{contact}/friendandfamily")
	public ResponseEntity<List<Long>> getSpecificFriendAndFamily(@PathVariable("contact") long contact)
			throws FriendAndFamilyException {
		return new ResponseEntity<>(friendAndFamilyService.getSpecificFriendAndFamily(contact), HttpStatus.OK);
	}
}
