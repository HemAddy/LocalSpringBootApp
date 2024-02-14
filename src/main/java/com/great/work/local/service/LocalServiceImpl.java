package com.great.work.local.service;

import com.great.work.local.dao.EmpDetailsDao;
import com.great.work.local.repository.LocalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class LocalServiceImpl implements LocalService {
    @Autowired
    LocalRepository repository;
    @Override
    public String postToTable(EmpDetailsDao empDetailsdao) {
        var response = repository.save(empDetailsdao);
        log.info("Post Response:::{}",response.toString());
        return response.toString();
    }

    @Override
    public EmpDetailsDao getName(int id){
        var empDetailsDao = repository.getById(Long.valueOf(id));
        return empDetailsDao;
    }
}
