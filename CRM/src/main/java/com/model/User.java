package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_master")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	int UserId;
	
	@Column(name = "username")
	String UserName;
	
	@Column(name = "email")
	String Eamil;
	
	@Column(name = "phno")
	String PhoneNumber;
	
	@Column(name = "pass")
	String Password;
	
	@Column(name = "address")
	String Address;
	
	@ManyToOne
	@JoinColumn(name="rollid")
	UserRoll userRoll;

	
	
	
	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEamil() {
		return Eamil;
	}

	public void setEamil(String eamil) {
		Eamil = eamil;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public UserRoll getUserRoll() {
		return userRoll;
	}

	public void setUserRoll(UserRoll userRoll) {
		this.userRoll = userRoll;
	}

	

}
