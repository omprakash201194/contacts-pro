package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Groups repository.
 */
@Repository
public interface GroupsRepository extends JpaRepository<Groups, Long> {
}
