package com.omprakashgautam.app.contactspro.service;

import com.omprakashgautam.app.contactspro.domain.Contact;
import com.omprakashgautam.app.contactspro.dto.ContactAllDTO;
import com.omprakashgautam.app.contactspro.dto.ContactDTO;
import com.omprakashgautam.app.contactspro.dto.PostContactDTO;
import com.omprakashgautam.app.contactspro.mapper.MapStructMapper;
import com.omprakashgautam.app.contactspro.repository.ContactRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

/**
 * @author omprakash gautam
 * Created on 03-Jul-21 at 9:31 AM.
 */
@Service
public class ContactService {
    private final ContactRepository contactRepository;
    private final MapStructMapper mapper;

    public ContactService(ContactRepository contactRepository, MapStructMapper mapper) {
        this.contactRepository = contactRepository;
        this.mapper = mapper;
    }


    public List<ContactAllDTO> getContactList() {
        return mapper.contactsToContactDTOs(contactRepository.findAll());
    }

    public ContactDTO getContactById(String id) {
        return mapper.contactToContactDTO(getContact(id));
    }

    private Contact getContact(String id) {
        Optional<Contact> optionalContact = contactRepository.findByuuid(UUID.fromString(id));
        return optionalContact.orElseThrow(() -> {
            throw new IllegalStateException(("No contact found with given id"));
        });
    }

    public ContactDTO addContact(PostContactDTO contactDTO) {
        Contact savedContact = contactRepository.save(mapper.contactDTOToContact(contactDTO));
        return mapper.contactToContactDTO(savedContact);
    }

    public ContactDTO updateContact(String id, PostContactDTO contactDTO) {
        Contact target = getContact(id);
        Contact source = mapper.contactDTOToContact(contactDTO);
        BeanUtils.copyProperties(source,target);
        Contact savedContact = contactRepository.save(target);
        return mapper.contactToContactDTO(savedContact);
    }

    public ContactDTO patchContact(String id, PostContactDTO contactDTO) {
        Contact target = getContact(id);
        Contact source = mapper.contactDTOToContact(contactDTO);
        target.setFirstName(validateAndSet(source.getFirstName(), target.getFirstName()));
        target.setLastName(validateAndSet(source.getLastName(), target.getLastName()));
        target.setMiddleName(validateAndSet(source.getMiddleName(), target.getMiddleName()));
        target.setNameSuffix(validateAndSet(source.getNameSuffix(), target.getNameSuffix()));
        target.setNamePrefix(validateAndSet(source.getNamePrefix(), target.getNamePrefix()));
        target.setInitials(validateAndSet(source.getInitials(), target.getInitials()));
        target.setShortName(validateAndSet(source.getShortName(), target.getShortName()));
        target.setMaidenName(validateAndSet(source.getMaidenName(), target.getMaidenName()));
        target.setDateOfBirth(Objects.nonNull(source.getDateOfBirth()) ? source.getDateOfBirth() : target.getDateOfBirth());
        target.setLocation(validateAndSet(source.getLocation(), target.getLocation()));
        target.setNotes(validateAndSet(source.getNotes(), target.getNotes()));
        target.setIsFavorite(Objects.nonNull(source.getIsFavorite()) ? source.getIsFavorite() : target.getIsFavorite());
        target.setGender(Objects.nonNull(source.getGender()) ? source.getGender() : target.getGender());
        target.setPreferredLanguage(Objects.nonNull(source.getPreferredLanguage()) ? source.getPreferredLanguage() : target.getPreferredLanguage());
        Contact savedContact = contactRepository.save(target);
        return mapper.contactToContactDTO(savedContact);
    }

    private String validateAndSet(String source, String target) {
        return Objects.nonNull(source) ? source : target;
    }

    public void deleteContactById(String id) {
        Contact contact = getContact(id);
        contactRepository.delete(contact);
    }
}
