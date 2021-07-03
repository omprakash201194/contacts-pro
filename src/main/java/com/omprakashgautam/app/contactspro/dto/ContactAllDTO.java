package com.omprakashgautam.app.contactspro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.util.UUID;

/**
 * The type Contact dto.
 *
 * @author omprakash gautam Created on 03-Jul-21 at 5:54 PM.
 */
@Getter
@Setter
public class ContactAllDTO extends RepresentationModel<ContactAllDTO> {
    @JsonProperty("id")
    private UUID uuid;
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean isFavorite;
}
