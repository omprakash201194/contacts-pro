package com.omprakashgautam.app.contactspro.repository;

import com.omprakashgautam.app.contactspro.domain.DomainObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
import java.util.UUID;

/**
 * @author omprakash gautam
 * Created on 03-Jul-21 at 6:55 PM.
 */
@NoRepositoryBean
public interface DomainObjectRepository<T> extends JpaRepository<T, Long> {
    Optional<T> findByuuid(UUID uuid);
}
