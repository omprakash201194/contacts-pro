package com.omprakashgautam.app.contactspro.service;

import com.omprakashgautam.app.contactspro.domain.Contact;
import com.omprakashgautam.app.contactspro.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author omprakash gautam
 * Created on 03-Jul-21 at 9:31 AM.
 */
@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    public List<Contact> getContactList() {
        return contactRepository.findAll();
    }
}
