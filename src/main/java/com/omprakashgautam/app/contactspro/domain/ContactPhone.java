package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.CommunicationType;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * The type Contact phone.
 *
 * @author omprakash gautam Created on 02-Jul-21 at 9:54 PM.
 */
@Entity
@Data
@ToString
public class ContactPhone {
    @Id
    @GeneratedValue
    private Long id;

    private CommunicationType type;

    private String countryCode;

    private String number;

    private boolean isDefault;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="contact_id", nullable=false)
    private Contact contact;
}
