package com.ms.ffd.dto;

import com.ms.ffd.entity.FriendFamily;

public class FriendFamilyDTO {

	private int id;
	private long contact;
	private long friendAndFamily;

	public static FriendFamilyDTO createDTO(FriendFamily friendFamily) {
		FriendFamilyDTO friendFamilyDTO = new FriendFamilyDTO();
		friendFamilyDTO.setId(friendFamily.getId());
		friendFamilyDTO.setContact(friendFamily.getContact());
		friendFamilyDTO.setFriendAndFamily(friendFamily.getFriendAndFamily());
		return friendFamilyDTO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getFriendAndFamily() {
		return friendAndFamily;
	}

	public void setFriendAndFamily(long friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}

}
