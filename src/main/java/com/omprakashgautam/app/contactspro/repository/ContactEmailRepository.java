package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.ContactEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Contact email repository.
 */
@Repository
public interface ContactEmailRepository extends JpaRepository<ContactEmail, Long> {
}
