package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="userroll")
public class UserRoll {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rollid")
	int rollId;
	@Column(name="rollname")
	String rollName;
	
	@OneToMany(mappedBy = "userRoll")
	List<User> users;
	
	
	public int getRollId() {
		return rollId;
	}
	public void setRollId(int rollId) {
		this.rollId = rollId;
	}
	public String getRollName() {
		return rollName;
	}
	public void setRollName(String rollName) {
		this.rollName = rollName;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
}
