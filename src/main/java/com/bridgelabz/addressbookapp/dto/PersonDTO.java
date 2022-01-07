package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

/**
 * @Data : Auto Generate getters and setters, constructor, toString
 *
 */
public @Data class PersonDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$", message = "First name Invalid")
	@NotBlank(message = "First name can not be null")
	private String firstName;

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$", message = "Last name Invalid")
	@NotBlank(message = "Last name can not be null")
	private String lastName;

	@Pattern(regexp = "male|female", message = "Gender needs to either male or female")
	@NotBlank(message = "Gender can not be null")
	private String gender;

	@Pattern(regexp = "^[1-9]{2}\\s{1}[0-9]{10}$", message = "phone Number is invalid")
	@NotBlank(message = "phone Number can not be null")
	private String phoneNumber;

	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "email is invalid")
	@NotBlank(message = "email can not be null")
	private String email;

	@NotBlank(message = "Address can not be null")
	private String address;

	@NotBlank(message = "city can not be null")
	private String city;

	@NotBlank(message = "State can not be null")
	private String state;

	@NotBlank(message = "Country can not be null")
	private String country;

	@NotBlank(message = "profilePic can not be null")
	private String profilePic;

}
