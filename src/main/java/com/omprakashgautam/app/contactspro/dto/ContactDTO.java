package com.omprakashgautam.app.contactspro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omprakashgautam.app.contactspro.domain.ContactEmail;
import com.omprakashgautam.app.contactspro.domain.ContactPhone;
import com.omprakashgautam.app.contactspro.domain.Groups;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

/**
 * The type Contact dto.
 *
 * @author omprakash gautam Created on 03-Jul-21 at 5:54 PM.
 */
@Getter
@Setter
public class ContactDTO {
    @JsonProperty("id")
    private UUID uuid;
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean isFavorite;
}
