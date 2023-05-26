package com.ms.ffd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.ffd.entity.FriendFamily;

@Repository
public interface FriendFamilyRepository extends JpaRepository<FriendFamily, Integer> {

	List<FriendFamily> findFriendFamilyByContact(long contact);
}
