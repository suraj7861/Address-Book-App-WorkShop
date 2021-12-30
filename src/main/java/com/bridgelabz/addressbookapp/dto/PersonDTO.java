package com.bridgelabz.addressbookapp.dto;

public class PersonDTO {

	public String fName;
	public String lName;
	public String gender;
	public long phoneNumber;
	public String email;
	public String address;
	public String city;
	public String state;
	public String country;
	public String profilePic;

	public PersonDTO(String fName, String lName, String gender, long phoneNumber, String email, String address,
			String city, String state, String country, String profilePic) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.profilePic = profilePic;
	}

	@Override
	public String toString() {
		return "PersonDTO [fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", address=" + address + ", city=" + city + ", state=" + state + ", country="
				+ country + ", profilePic=" + profilePic + "]";
	}

}
