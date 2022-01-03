package com.bridgelabz.addressbookapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookModel;
import com.bridgelabz.addressbookapp.service.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

	@Autowired
	private IAddressBookService addressBookService;

	@PostMapping("/Create")
	public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO bookDTO) {
		AddressBookModel createBook = null;
		createBook = addressBookService.createAddressBookData(bookDTO);
		ResponseDTO respDTO = new ResponseDTO("created address book successfully", createBook);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}
