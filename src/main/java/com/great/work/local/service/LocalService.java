package com.great.work.local.service;

import com.great.work.local.dao.EmpDetailsDao;

public interface LocalService {

    public String postToTable(EmpDetailsDao empDetailsdao);
    public EmpDetailsDao getName(int id);

}
