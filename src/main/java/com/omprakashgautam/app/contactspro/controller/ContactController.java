package com.omprakashgautam.app.contactspro.controller;

import com.omprakashgautam.app.contactspro.dto.ContactDTO;
import com.omprakashgautam.app.contactspro.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author omprakash gautam
 * Created on 03-Jul-21 at 9:10 AM.
 */
@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<ContactDTO> getContacts(){
        return contactService.getContactList();
    }

    @GetMapping(path = "/{id}")
    public ContactDTO getContactById(@PathVariable("id") String id){
        return contactService.getContactById(id);
    }

}
