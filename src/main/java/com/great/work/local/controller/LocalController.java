package com.great.work.local.controller;

import com.great.work.local.dao.EmpDetailsDao;
import com.great.work.local.service.LocalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
public class LocalController {
    @Autowired
    LocalService localService;

    @PostMapping("/postName")
    public ResponseEntity<EmpDetailsDao> postName(@RequestBody EmpDetailsDao empDetailsdao) {
        var empDetailstoDb = localService.postToTable(empDetailsdao);
        return new ResponseEntity<>(empDetailsdao, HttpStatus.CREATED);
    }
    @GetMapping("/getName/{id}")
    public ResponseEntity<EmpDetailsDao> getName(@PathVariable("id") int id) {
        EmpDetailsDao empDetails = localService.getName(id);
        log.info("id:::{},Name:::{},Role:::{},DateofJoining:::{}",
                empDetails.getId(), empDetails.getName(), empDetails.getRole(), empDetails.getDoj());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
