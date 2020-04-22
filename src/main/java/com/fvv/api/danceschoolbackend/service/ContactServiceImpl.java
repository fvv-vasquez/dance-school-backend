package com.fvv.api.danceschoolbackend.service;

import com.fvv.api.danceschoolbackend.dao.ContactDao;
import com.fvv.api.danceschoolbackend.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public Contact saveFormContact(Contact contact) {
        int rows = this.contactDao.saveFormContact(contact);
        if(rows == 1) {
            return contact;
        } else {
            return null;
        }
    }
}
