package com.bridgelabz.addressbookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.PersonDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.PersonData;
import com.bridgelabz.addressbookapp.service.IPersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private IPersonService personService;

	/**
	 * Add person details in DB
	 * 
	 * @param PersonDTO
	 * @return : PersonData and HttpStatus
	 */
	@PostMapping("/Create")
	public ResponseEntity<ResponseDTO> createAddressBookData(@RequestParam int adddressbookId,
			@RequestBody PersonDTO personDTO) {
		PersonData contactDetails = null;
		contactDetails = personService.createPersonData(adddressbookId, personDTO);
		ResponseDTO respDTO = new ResponseDTO("created address book data successfully", contactDetails);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * update person detail by id
	 * 
	 * @param : ContactId and PersonDTO
	 * @return : ResponseDTO
	 */
	@PutMapping("/Update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestParam int addressbookId,
			@RequestParam int personId, @RequestBody PersonDTO personDTO) {
		PersonData contactDetails = null;
		contactDetails = personService.updatePersonDta(addressbookId, personId, personDTO);
		ResponseDTO respDTO = new ResponseDTO("updated address book data successfully", contactDetails);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * get all person list from DB
	 * 
	 * @return : ResponseDTO
	 */
	@RequestMapping("/getAll")
	public ResponseEntity<ResponseDTO> getAllAddressBookData() {
		List<PersonData> addressBookList = null;
		addressBookList = personService.getPersonData();
		ResponseDTO respDTO = new ResponseDTO("Get call success", addressBookList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * get person details by id
	 * 
	 * @param id
	 * @return : ResponseDTO
	 */
	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> getAddressBookData(@RequestParam int addressbookId, @RequestParam int personId) {
		PersonData contactDetails = null;
		contactDetails = personService.getPersonDataById(addressbookId, personId);
		ResponseDTO respDTO = new ResponseDTO("Get call success for id:" + personId, contactDetails);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * delete person details by id
	 * 
	 * @param : contactId
	 * @return : ResponseDTO
	 */
	@DeleteMapping("/Delete")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@RequestParam int addressbookId,
			@RequestParam int personId) {
		personService.deletePersonData(addressbookId, personId);
		ResponseDTO respDTO = new ResponseDTO("Deleted AddressBook data Successfully", "deleted id is :" + personId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
