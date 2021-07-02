package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.OccupationType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author omprakash gautam
 * Created on 02-Jul-21 at 9:14 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Occupation extends DomainObject {
    @Id
    @GeneratedValue
    private Long id;

    private OccupationType type;

    private String profession;

    private String specialization;

    @OneToMany(mappedBy="occupation")
    private Set<Contact> contacts;
}
