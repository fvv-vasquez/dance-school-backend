package com.fvv.api.danceschoolbackend.service;

import com.fvv.api.danceschoolbackend.dao.DanceTypeDao;
import com.fvv.api.danceschoolbackend.models.DanceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanceTypeServiceImpl implements DanceTypeService {

    @Autowired
    private DanceTypeDao danceTypeDao;

    @Override
    public List<DanceType> listAll() {
        return this.danceTypeDao.listAll();
    }
}
