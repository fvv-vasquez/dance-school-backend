package com.fvv.api.danceschoolbackend.dao;

import com.fvv.api.danceschoolbackend.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveFormContact(Contact contact) {

        String SQL_INSERT = "INSERT INTO dance_types.tb_contact" +
                "(name, email, address, cellphone, dancetype, schedule, age, level, comment)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";

        return jdbcTemplate.update(
                SQL_INSERT,
                contact.getName(), contact.getEmail(), contact.getAddress(), contact.getCellphone(),
                contact.getDanceType(), contact.getSchedule(), contact.getAge(), contact.getLevel(),
                contact.getComment());
    }
}
