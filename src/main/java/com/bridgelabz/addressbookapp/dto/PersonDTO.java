package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

/**
 * @Data : Auto Generate getters and setters, constructor, toString
 *
 */
public @Data class PersonDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$", message = "First name Invalid")
	@NotBlank(message = "First name can not be null")
	public String firstName;

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$", message = "Last name Invalid")
	@NotBlank(message = "Last name can not be null")
	public String lastName;

	@Pattern(regexp = "male|female", message = "Gender needs to either male or female")
	@NotBlank(message = "Gender can not be null")
	public String gender;

	//@Pattern(regexp = "^[0-9]{10}$", message = "phone Number is invalid")
	//@NotBlank(message = "phone Number can not be null")
	public long phoneNumber;

	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "email is invalid")
	@NotBlank(message = "email can not be null")
	public String email;

	@NotBlank(message = "Address can not be null")
	public String address;

	@NotBlank(message = "city can not be null")
	public String city;

	@NotBlank(message = "State can not be null")
	public String state;

	@NotBlank(message = "Country can not be null")
	public String country;

	@NotBlank(message = "profilePic can not be null")
	public String profilePic;

}
