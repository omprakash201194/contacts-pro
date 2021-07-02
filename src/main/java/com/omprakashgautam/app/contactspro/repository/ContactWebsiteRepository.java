package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.ContactWebsite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Contact website repository.
 */
@Repository
public interface ContactWebsiteRepository extends JpaRepository<ContactWebsite, Long> {
}
