package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.CommunicationType;
import com.omprakashgautam.app.contactspro.enums.WebsiteType;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author omprakash gautam
 * Created on 02-Jul-21 at 9:54 PM.
 */
@Entity
@Data
@ToString
public class ContactWebsite {

    @Id
    @GeneratedValue
    private Long id;

    private WebsiteType type;

    private String url;

    private boolean isDefault;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="contact_id", nullable=false)
    private Contact contact;
}
