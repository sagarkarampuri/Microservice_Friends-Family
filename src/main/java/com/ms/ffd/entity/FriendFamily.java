package com.ms.ffd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FriendFamily {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long contact;
	private long friendAndFamily;

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
