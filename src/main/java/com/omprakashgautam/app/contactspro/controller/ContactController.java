package com.omprakashgautam.app.contactspro.controller;

import com.omprakashgautam.app.contactspro.dto.ContactDTO;
import com.omprakashgautam.app.contactspro.mapper.MapStructMapper;
import com.omprakashgautam.app.contactspro.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author omprakash gautam
 * Created on 03-Jul-21 at 9:10 AM.
 */
@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactService contactService;

    private final MapStructMapper mapstructMapper;

    @Autowired
    public ContactController(ContactService contactService, MapStructMapper mapstructMapper) {
        this.contactService = contactService;
        this.mapstructMapper = mapstructMapper;
    }

    @GetMapping
    public List<ContactDTO> getContacts(){
        return mapstructMapper.contactsToContactDTOs(contactService.getContactList());
    }

}
