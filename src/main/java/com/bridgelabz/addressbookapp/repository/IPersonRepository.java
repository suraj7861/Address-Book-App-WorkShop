package com.bridgelabz.addressbookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.model.PersonData;

@Repository
public interface IPersonRepository extends JpaRepository<PersonData, Integer> {

	 @Query(value = "select * from person_data where add_id= :AddressBookId",nativeQuery = true)
	 List<PersonData> findPersonsByAddressBookId(int AddressBookId);
}
