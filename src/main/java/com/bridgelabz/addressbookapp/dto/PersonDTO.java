package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

/**
 * @Data : Auto Generate getters and setters, constructor, toString
 *
 */
public @Data class PersonDTO {

	private String fName;
	private String lName;
	private String gender;
	private long phoneNumber;
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	private String profilePic;
	
	

}
