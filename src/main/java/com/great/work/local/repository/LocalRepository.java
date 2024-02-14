package com.great.work.local.repository;

import com.great.work.local.dao.EmpDetailsDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalRepository extends JpaRepository<EmpDetailsDao, Long> {

}
