package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookapp.model.PersonData;

public interface IPersonRepository extends JpaRepository<PersonData, Integer> {

}
