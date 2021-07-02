package com.omprakashgautam.app.contactspro.domain;

import com.omprakashgautam.app.contactspro.enums.Gender;
import com.omprakashgautam.app.contactspro.enums.Language;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

/**
 * @author omprakash gautam
 * Created on 02-Jul-21 at 7:49 PM.
 */
@Data
@Entity
public class Contact extends  DomainObject{
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String middleName;
    private String lastName;
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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="occupation_id", nullable=false)
    private Occupation occupation;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
            name = "contact_hobby",
            joinColumns = @JoinColumn(name = "contact_id"),
            inverseJoinColumns = @JoinColumn(name = "hobby_id"))
    private Set<Hobby> hobbies;




    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
