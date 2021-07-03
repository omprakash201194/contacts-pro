package com.omprakashgautam.app.contactspro.controller;

import com.omprakashgautam.app.contactspro.dto.ContactAllDTO;
import com.omprakashgautam.app.contactspro.dto.ContactDTO;
import com.omprakashgautam.app.contactspro.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

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

    @GetMapping(produces = { "application/hal+json" })
    public CollectionModel<ContactAllDTO> getContacts(){
        List<ContactAllDTO> contactList = contactService.getContactList();

        for (final ContactAllDTO contactDto : contactList) {
            Link selfLink = linkTo(methodOn(ContactController.class)
                    .getContactById(contactDto.getUuid().toString())).withSelfRel();
            contactDto.add(selfLink);
        }

        Link link = linkTo(methodOn(ContactController.class)
                .getContacts()).withSelfRel();
        return CollectionModel.of(contactList, link);
    }

    @GetMapping(path = "/{id}")
    public ContactDTO getContactById(@PathVariable("id") String id){
        ContactDTO contactDTO = contactService.getContactById(id);

        linkContact(contactDTO);

        return contactDTO;
    }

    private void linkContact(ContactDTO contact) {
        Link selfLink = linkTo(methodOn(ContactController.class)
                .getContactById(contact.getUuid().toString())).withSelfRel();
        contact.add(selfLink);

        Link link = linkTo(methodOn(ContactController.class)
                .getContacts()).withRel("contacts");
        contact.add(link);
    }

    @PostMapping
    public ContactDTO addContact(@RequestBody ContactDTO contactDTO) {
        ContactDTO savedContactDto = contactService.addContact(contactDTO);
        linkContact(savedContactDto);
        return savedContactDto;
    }

}
