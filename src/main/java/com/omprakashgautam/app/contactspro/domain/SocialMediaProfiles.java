package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.SocialMediaPlatform;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author omprakash gautam
 * Created on 02-Jul-21 at 11:05 PM.
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class SocialMediaProfiles extends DomainObject {

    @Id
    @GeneratedValue
    private Long id;

    private SocialMediaPlatform platform;

    private String url;

    private String profileId;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="contact_id", nullable=false)
    private Contact contact;
}
