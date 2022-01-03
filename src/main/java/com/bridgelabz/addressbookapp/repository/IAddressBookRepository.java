package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookapp.model.AddressBookModel;

public interface IAddressBookRepository extends JpaRepository<AddressBookModel, Integer> {

}
