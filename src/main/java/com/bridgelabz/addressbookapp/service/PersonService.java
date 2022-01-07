package com.bridgelabz.addressbookapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.exception.PersonException;
import com.bridgelabz.addressbookapp.model.AddressBookModel;
import com.bridgelabz.addressbookapp.model.PersonData;
import com.bridgelabz.addressbookapp.repository.IAddressBookRepository;
import com.bridgelabz.addressbookapp.repository.IPersonRepository;

@Service
public class PersonService implements IPersonService {

	/**
	 * @Autowired Perform CRUD operation with DB
	 */
	@Autowired
	private IPersonRepository personRepository;

	@Autowired
	private IAddressBookRepository addressbookrepo;

	@Autowired
	private IAddressBookService addressBookService;

	/**
	 * @param : adddressbookId, PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData createPersonData(int adddressbookId, PersonDTO personDTO) {
		PersonData contactData = null;
		contactData = new PersonData(personDTO);
		Optional<AddressBookModel> addressbook = addressbookrepo.findById(adddressbookId);
		if (addressbook.isPresent()) {
			contactData.setAddressBook(addressbook.get());
		}else {
			addressBookService.getAddressBookDataById(adddressbookId);
		}
		return personRepository.save(contactData);
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData updatePersonDta(int adddressbookId, int personId, PersonDTO personDTO) {
		PersonData personData = this.getPersonDataById(personId);
		personData.updatePersonData(personDTO);
		Optional<AddressBookModel> addressbook = addressbookrepo.findById(adddressbookId);
		if (addressbook.isPresent()) {
			personData.setAddressBook(addressbook.get());
		} else {
			addressBookService.getAddressBookDataById(adddressbookId);
		}
		return personRepository.save(personData);
	}

	/**
	 * @return : PersonData
	 */
	@Override
	public List<PersonData> getPersonData() {
		return personRepository.findAll();
	}

	/**
	 * @param id
	 * @return : PersonData
	 */
	@Override
	public PersonData getPersonDataById(int personId) {
		return personRepository.findById(personId)
				.orElseThrow(() -> new PersonException("User with User id " + personId + " does not exist !..."));
	}

	/**
	 * @param id
	 * @return : void
	 */
	@Override
	public void deletePersonData(int personId) {
		PersonData personData = this.getPersonDataById(personId);
		personRepository.delete(personData);
	}

	@Override
	public List<PersonData> getPersonsDataByAddressBookId(int AddressBookId) {
		return personRepository.findPersonsByAddressBookId(AddressBookId);
	}
}
