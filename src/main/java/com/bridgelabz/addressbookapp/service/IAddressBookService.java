package com.bridgelabz.addressbookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookModel;

@Service
public interface IAddressBookService {

	AddressBookModel createAddressBookData(AddressBookDTO bookDTO);

	AddressBookModel updateAddressBookData(int addressbookId, AddressBookDTO bookDTO);

	List<AddressBookModel> getAddressBookData();

	AddressBookModel getAddressBookDataById(int addressbookId);

	void deleteAddressBookData(int addressbookId);
}
