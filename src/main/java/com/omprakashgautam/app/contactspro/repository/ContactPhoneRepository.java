package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.ContactPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Contact phone repository.
 */
@Repository
public interface ContactPhoneRepository extends JpaRepository<ContactPhone, Long> {
}
