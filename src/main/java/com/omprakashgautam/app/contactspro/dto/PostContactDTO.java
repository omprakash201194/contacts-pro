package com.omprakashgautam.app.contactspro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omprakashgautam.app.contactspro.enums.Gender;
import com.omprakashgautam.app.contactspro.enums.Language;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;
import java.util.UUID;

/**
 * The type Contact dto.
 *
 * @author omprakash gautam Created on 03-Jul-21 at 5:54 PM.
 */
@Getter
@Setter
public class PostContactDTO extends RepresentationModel<PostContactDTO>{
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean isFavorite;
    private String nameSuffix;
    private String namePrefix;
    private String initials;
    private String shortName;
    private String maidenName;
    private LocalDate dateOfBirth;
    private String location;
    private String notes;

    private Gender gender;
    private Language preferredLanguage;

    /*@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="occupation_id")
    private Occupation occupation;

    @OneToMany(mappedBy="contact")
    private Set<ContactEmail> emails;

    @OneToMany(mappedBy="contact")
    private Set<ContactPhone> phones;

    @OneToMany(mappedBy="contact")
    private Set<ContactWebsite> websites;

    @OneToMany(mappedBy="contact")
    private Set<ContactAddress> addresses;

    @OneToMany(mappedBy="contact")
    private Set<ContactAdditionalFields> contactAdditionalFields;

    @OneToMany(mappedBy="contact")
    private Set<SocialMediaProfiles> socialMediaProfiles;

    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(
            name = "contact_hobby_mapping",
            joinColumns = @JoinColumn(name = "contact_id"),
            inverseJoinColumns = @JoinColumn(name = "hobby_id"))
    private Set<Hobby> hobbies;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
            name = "contact_group_mapping",
            joinColumns = @JoinColumn(name = "contact_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<Groups> groups;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
            name = "contact_organization_mapping",
            joinColumns = @JoinColumn(name = "contact_id"),
            inverseJoinColumns = @JoinColumn(name = "organization_id"))
    private Set<Organization> organizations;*/
}
