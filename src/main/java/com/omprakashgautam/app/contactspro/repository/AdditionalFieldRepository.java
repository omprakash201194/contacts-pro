package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.AdditionalField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Additional field repository.
 */
@Repository
public interface AdditionalFieldRepository extends JpaRepository<AdditionalField, Long> {
}
