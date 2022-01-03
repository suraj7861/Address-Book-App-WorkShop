package com.bridgelabz.addressbookapp.service;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookModel;
import com.bridgelabz.addressbookapp.model.PersonData;

public interface IAddressBookService {

	AddressBookModel createAddressBookData(AddressBookDTO bookDTO);

	AddressBookModel updateAddressBookDta(int id, AddressBookDTO bookDTO);

	List<PersonData> getAddressBookData();

	AddressBookModel getAddressBookDataById(int id);

	void deleteAddressBookData(int id);
}
