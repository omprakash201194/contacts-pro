package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.CommunicationType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * The type Contact email.
 *
 * @author omprakash gautam Created on 02-Jul-21 at 9:46 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class ContactEmail extends  DomainObject{
    @Id
    @GeneratedValue
    private Long id;

    private CommunicationType type;

    private String email;

    private boolean isDefault;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="contact_id", nullable=false)
    private Contact contact;
}
