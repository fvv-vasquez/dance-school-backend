package com.fvv.api.danceschoolbackend.controller;

import com.fvv.api.danceschoolbackend.models.Contact;
import com.fvv.api.danceschoolbackend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @CrossOrigin
    @PostMapping(
            value = "/saveContact", consumes = "application/json", produces = "application/json")
    public Contact saveContact (@RequestBody Contact contact) {
        return contactService.saveFormContact(contact);
    }
}
