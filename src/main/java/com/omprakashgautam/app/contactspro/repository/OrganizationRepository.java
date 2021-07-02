package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Organization repository.
 */
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
