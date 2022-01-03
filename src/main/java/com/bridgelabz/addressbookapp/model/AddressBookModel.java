package com.bridgelabz.addressbookapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;
@Entity
public @Data class AddressBookModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private int bookId;
	
	private String addressBookName;
	
//	@OneToMany(targetEntity = PersonData.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "add_id", referencedColumnName = "book_id")
//	private List<PersonData> personList;

	public AddressBookModel() {
		super();
	}

	public AddressBookModel(AddressBookDTO bookDTO) {
		super();
		this.updateAddressBookData(bookDTO);
	}

	public void updateAddressBookData(AddressBookDTO bookDTO) {
		this.addressBookName = bookDTO.addressBookName;
	}
}
