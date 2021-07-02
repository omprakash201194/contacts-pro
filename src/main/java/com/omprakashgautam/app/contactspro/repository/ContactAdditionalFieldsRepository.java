package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.ContactAdditionalFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Contact additional fields repository.
 */
@Repository
public interface ContactAdditionalFieldsRepository extends JpaRepository<ContactAdditionalFields, Long> {
}
