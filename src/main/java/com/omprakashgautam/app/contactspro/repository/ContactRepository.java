package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.Contact;
import org.springframework.stereotype.Repository;

/**
 * The interface Contact repository.
 */
@Repository
public interface ContactRepository extends DomainObjectRepository<Contact> {

}
