package com.example.demo.Repo;

import com.example.demo.entity.meds;

import java.sql.ClientInfoStatus;
import java.util.List;

public interface medsRepoImplq {
    List<meds> find1();
    List<meds> find2();
    List<meds> findS(String name);

}
