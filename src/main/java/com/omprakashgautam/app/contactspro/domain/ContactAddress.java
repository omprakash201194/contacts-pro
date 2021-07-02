package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.WebsiteType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * The type Contact address.
 *
 * @author omprakash gautam Created on 02-Jul-21 at 9:54 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class ContactAddress extends  DomainObject {
    @Id
    @GeneratedValue
    private Long id;

    private String line1;
    private String line2;
    private String line3;
    private String district;
    private String city;
    private String state;
    private String country;
    private String postal;

    private boolean isDefault;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="contact_id", nullable=false)
    private Contact contact;
}
