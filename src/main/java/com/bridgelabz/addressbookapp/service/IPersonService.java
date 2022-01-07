package com.bridgelabz.addressbookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.model.PersonData;

@Service
public interface IPersonService {

	/**
	 * Method: update person details
	 */
	PersonData updatePersonDta(int adddressbookId, int personId, PersonDTO personDTO);

	/**
	 * Method: get person details
	 */
	List<PersonData> getPersonData();

	/**
	 * Method: get person detail by personId
	 */
	PersonData getPersonDataById(int personId);

	/**
	 * Method: delete person details
	 */
	void deletePersonData(int personId);

	/**
	 * Method: add person details
	 */
	PersonData createPersonData(int adddressbookId, PersonDTO personDTO);

	/**
	 * Method: get persons details by AddressBookId
	 */
	List<PersonData> getPersonsDataByAddressBookId(int AddressBookId);
}
