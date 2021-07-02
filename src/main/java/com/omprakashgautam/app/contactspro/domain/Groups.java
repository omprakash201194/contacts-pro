package com.omprakashgautam.app.contactspro.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * The type Groups.
 *
 * @author omprakash gautam Created on 02-Jul-21 at 9:37 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Groups extends DomainObject{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private boolean isFavorite;

    @ManyToMany(mappedBy = "groups")
    private Set<Contact> contacts;
}
