package com.omprakashgautam.app.contactspro.service;

import com.omprakashgautam.app.contactspro.domain.Contact;
import com.omprakashgautam.app.contactspro.dto.ContactAllDTO;
import com.omprakashgautam.app.contactspro.dto.ContactDTO;
import com.omprakashgautam.app.contactspro.mapper.MapStructMapper;
import com.omprakashgautam.app.contactspro.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author omprakash gautam
 * Created on 03-Jul-21 at 9:31 AM.
 */
@Service
public class ContactService {
    private final ContactRepository contactRepository;
    private final MapStructMapper mapstructMapper;

    public ContactService(ContactRepository contactRepository, MapStructMapper mapstructMapper) {
        this.contactRepository = contactRepository;
        this.mapstructMapper = mapstructMapper;
    }


    public List<ContactAllDTO> getContactList() {
        return mapstructMapper.contactsToContactDTOs(contactRepository.findAll());
    }

    public ContactDTO getContactById(String id) {
       Optional<Contact> optionalContact = contactRepository.findByuuid(UUID.fromString(id));
        Contact contact = optionalContact.orElseThrow(() -> {
            throw new IllegalStateException(("No contact found with given id"));
        });
        return mapstructMapper.contactToContactDTO(contact);
    }
}
