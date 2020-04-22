package com.fvv.api.danceschoolbackend.controller;

import com.fvv.api.danceschoolbackend.models.DanceType;
import com.fvv.api.danceschoolbackend.service.DanceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dance-types")
public class DanceTypeController {

    @Autowired
    private DanceTypeService danceTypeService;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<DanceType>> findAll() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", "application/json");
        return ResponseEntity.ok()
                .headers(responseHeaders)
                .body(this.danceTypeService.listAll());
    }
}
