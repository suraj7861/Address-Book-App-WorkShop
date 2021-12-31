package com.bridgelabz.addressbookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.model.PersonData;
import com.bridgelabz.addressbookapp.repository.IPersonRepository;

@Service
public class PersonService implements IPersonService {

	/**
	 * @Autowired
	 * Perform CRUD operation with DB
	 */
	@Autowired
	private IPersonRepository personRepository;

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData createPersonData(PersonDTO personDTO) {
		PersonData contactData = null;
		contactData = new PersonData(personDTO);
		return personRepository.save(contactData);
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData updatePersonDta(int id, PersonDTO personDTO) {
		PersonData personData = this.getPersonDataById(id);
		personData.updatePersonData(personDTO);
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
	public PersonData getPersonDataById(int id) {
		return personRepository.findById(id).get();
	}

	/**
	 * @param id
	 * @return : void
	 */
	@Override
	public void deletePersonData(int id) {
		PersonData personData = this.getPersonDataById(id);
		personRepository.delete(personData);
	}

}
