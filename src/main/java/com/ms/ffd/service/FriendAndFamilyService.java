package com.ms.ffd.service;

import java.util.List;

import com.ms.ffd.dto.FriendFamilyDTO;
import com.ms.ffd.exception.FriendAndFamilyException;

public interface FriendAndFamilyService {

	FriendFamilyDTO getFriendFamilyById(int id) throws FriendAndFamilyException;

	List<Long> getSpecificFriendAndFamily(long contact) throws FriendAndFamilyException;
}
