package com.omprakashgautam.app.contactspro.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.util.UUID;

/**
 * @author omprakash gautam
 * Created on 02-Jul-21 at 7:46 PM.
 */
@Data
@MappedSuperclass
public class DomainObject {

    protected UUID uuid = UUID.randomUUID();

    protected LocalDate createdOn;

    protected LocalDate updatedOn;

}
