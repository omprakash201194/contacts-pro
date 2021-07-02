package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Occupation repository.
 */
@Repository
public interface OccupationRepository extends JpaRepository<Occupation, Long> {
}
