package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.HobbyType;
import com.omprakashgautam.app.contactspro.enums.OrganizationSector;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * @author omprakash gautam
 * Created on 02-Jul-21 at 10:03 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Organization extends  DomainObject {
    @Id
    @GeneratedValue
    private Long id;

    private OrganizationSector sector;

    private String name;

    private boolean isCurrent;

    @ManyToMany(mappedBy = "organizations")
    private Set<Contact> contacts;
}
