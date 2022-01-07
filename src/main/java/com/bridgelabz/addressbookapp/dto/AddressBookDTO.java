package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class AddressBookDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-z0-9]{2,}$", message = "Address Book name Invalid")
	@NotNull(message = "address Book Name can not be null")
	private String addressBookName;

}
