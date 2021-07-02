package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.SocialMediaProfiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Social media profiles repository.
 */
@Repository
public interface SocialMediaProfilesRepository extends JpaRepository<SocialMediaProfiles, Long> {
}
