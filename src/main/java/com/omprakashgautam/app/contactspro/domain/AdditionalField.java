package com.omprakashgautam.app.contactspro.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * The type Additional field.
 *
 * @author omprakash gautam Created on 02-Jul-21 at 10:58 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class AdditionalField extends DomainObject {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy="additionalField")
    private Set<ContactAdditionalFields> contactAdditionalFields;

    private boolean isCustom;
}
