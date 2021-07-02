package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.ContactAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Contact address repository.
 */
@Repository
public interface ContactAddressRepository extends JpaRepository<ContactAddress, Long> {
}
