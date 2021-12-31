package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.model.PersonData;

@Repository
public interface IPersonRepository extends JpaRepository<PersonData, Integer> {

}
