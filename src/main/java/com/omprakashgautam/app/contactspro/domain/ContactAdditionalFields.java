package com.omprakashgautam.app.contactspro.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * The type Contact additional fields.
 *
 * @author omprakash gautam Created on 02-Jul-21 at 10:56 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class ContactAdditionalFields extends DomainObject {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="additional_field_id", nullable=false)
    private AdditionalField additionalField;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="contact_id", nullable=false)
    private Contact contact;

    private String fieldValue;
}
