package com.bridgelabz.addressbookapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.model.PersonData;

@Service
public interface IPersonService {

	PersonData createPersonData(PersonDTO personDTO);

	PersonData updatePersonDta(long id, PersonDTO personDTO);

	List<PersonData> getPersonData();

	PersonData getPersonDataById(long id);

	void deletePersonData(long id);
}
