package com.omprakashgautam.app.contactspro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omprakashgautam.app.contactspro.domain.*;
import com.omprakashgautam.app.contactspro.enums.Gender;
import com.omprakashgautam.app.contactspro.enums.Language;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
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
public class ContactDTO extends PostContactDTO {
    @JsonProperty("id")
    private UUID uuid;
}
