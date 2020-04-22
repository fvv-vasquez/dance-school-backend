package com.fvv.api.danceschoolbackend.dao;

import com.fvv.api.danceschoolbackend.models.DanceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DanceTypeDaoImpl implements DanceTypeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DanceType> listAll() {

        String SQL_SELECT = "select * from dance_types.tb_dance_types";

        return jdbcTemplate.query(
                SQL_SELECT,
                (rs, rowNum) ->
                        new DanceType(
                                rs.getInt("id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
        );    }
}
