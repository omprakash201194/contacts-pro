package com.omprakashgautam.app.contactspro.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.util.UUID;

/**
 * The type Domain object.
 *
 * @author omprakash gautam Created on 02-Jul-21 at 7:46 PM.
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class DomainObject {

    /**
     * The Uuid.
     */
    protected UUID uuid = UUID.randomUUID();


    /**
     * The Created date.
     */
    @CreatedDate
    protected LocalDate createdDate;


    /**
     * The Last modified date.
     */
    @LastModifiedDate
    protected LocalDate lastModifiedDate;

}
