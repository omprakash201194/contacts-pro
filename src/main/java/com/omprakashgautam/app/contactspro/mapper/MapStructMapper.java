package com.omprakashgautam.app.contactspro.mapper;

import com.omprakashgautam.app.contactspro.domain.Contact;
import com.omprakashgautam.app.contactspro.dto.ContactAllDTO;
import com.omprakashgautam.app.contactspro.dto.ContactDTO;
import com.omprakashgautam.app.contactspro.dto.PostContactDTO;
import org.mapstruct.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author omprakash gautam
 * Created on 03-Jul-21 at 5:56 PM.
 */
@Mapper(
        componentModel = "spring", imports = {LocalDateTime.class, UUID.class}

)
public interface MapStructMapper {

    ContactDTO contactToContactDTO(Contact contact);
    Contact contactDTOToContact(PostContactDTO contactDto);

    @Mappings({
            @Mapping(target="dateOfBirth", source = "dateOfBirth",
                    dateFormat = "dd-MM-yyyy HH:mm:ss")})
    List<ContactAllDTO> contactsToContactDTOs(List<Contact> contacts);


}
