package com.ms.ffd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.ffd.dto.FriendFamilyDTO;
import com.ms.ffd.entity.FriendFamily;
import com.ms.ffd.exception.FriendAndFamilyException;
import com.ms.ffd.repository.FriendFamilyRepository;

@Service
public class FriendAndFamilyServiceImpl implements FriendAndFamilyService {

	@Autowired
	private FriendFamilyRepository friendFamilyRepository;

	@Override
	public FriendFamilyDTO getFriendFamilyById(int id) throws FriendAndFamilyException {
		FriendFamily friendFamily = friendFamilyRepository.findById(id)
				.orElseThrow(() -> new FriendAndFamilyException("friend and family not found id : " + id));
		return FriendFamilyDTO.createDTO(friendFamily);
	}

	@Override
	public List<Long> getSpecificFriendAndFamily(long contact) throws FriendAndFamilyException {
		List<FriendFamily> friendFamily = friendFamilyRepository.findFriendFamilyByContact(contact);
		if (friendFamily.isEmpty()) {
			throw new FriendAndFamilyException(
					"friends and family phone number not found with phone number : " + contact);
		}
		List<Long> list = new ArrayList<>();
		for (FriendFamily ff : friendFamily) {
			list.add(ff.getFriendAndFamily());
		}
		return list;
	}

}
