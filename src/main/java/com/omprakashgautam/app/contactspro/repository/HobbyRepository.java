package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Hobby repository.
 */
@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long> {
}
