package com.bridgelabz.addressbookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookModel;
import com.bridgelabz.addressbookapp.model.PersonData;
import com.bridgelabz.addressbookapp.repository.IAddressBookRepository;

@Service
public class AddressBookService implements IAddressBookService {
	@Autowired
	private IAddressBookRepository addressBook;

	@Override
	public AddressBookModel createAddressBookData(AddressBookDTO bookDTO) {
		AddressBookModel addressBookData = null;
		addressBookData = new AddressBookModel(bookDTO);
		return addressBook.save(addressBookData);
	}

	@Override
	public AddressBookModel updateAddressBookDta(int id, AddressBookDTO bookDTO) {
		return null;
	}

	@Override
	public List<PersonData> getAddressBookData() {
		return null;
	}

	@Override
	public AddressBookModel getAddressBookDataById(int id) {
		return null;
	}

	@Override
	public void deleteAddressBookData(int id) {
		// TODO Auto-generated method stub

	}

}
