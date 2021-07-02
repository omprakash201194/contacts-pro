package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.HobbyType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * The type Hobby.
 *
 * @author omprakash gautam Created on 02-Jul-21 at 9:29 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Hobby extends  DomainObject {

    @Id
    @GeneratedValue
    private Long id;

    private HobbyType type;

    private String name;

    private boolean isFavorite;

    @ManyToMany(mappedBy = "hobbies")
    private Set<Contact> contacts;
}
