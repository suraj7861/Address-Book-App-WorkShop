package com.bridgelabz.addressbookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.PersonDTO;

import lombok.Data;

/**
 * @Entity : specifies class is entity
 * @Table : table name
 * @Data : Auto Generate getters and setters, constructor, toString
 */
@Entity
@Table(name = "person_data")
public @Data class PersonData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int personId;
	private String firstName;
	private String lastName;
	private String gender;
	private String phoneNumber;
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	private String profilePic;
	
	@ManyToOne
	@JoinColumn(name = "add_id", referencedColumnName = "book_id")
	private AddressBookModel addressBook;

	public PersonData() {
		super();
	}

	public PersonData(PersonDTO personDTO) {
		super();
		this.updatePersonData(personDTO);
	}

	public void updatePersonData(PersonDTO personDTO) {
		this.firstName = personDTO.getFirstName();
		this.lastName = personDTO.getLastName();
		this.gender = personDTO.getGender();
		this.phoneNumber = personDTO.getPhoneNumber();
		this.email = personDTO.getEmail();
		this.address = personDTO.getAddress();
		this.city = personDTO.getCity();
		this.state = personDTO.getState();
		this.country = personDTO.getCountry();
		this.profilePic = personDTO.getProfilePic();

	}

}
