package com.example.demo.Repo;

import com.example.demo.entity.meds;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public  class medsRepoImpl implements medsRepoImplq {
    @PersistenceContext
    private EntityManager im;
@Override
    public List<meds> find1(){
        return im.createQuery("select  m from meds m order by m.popularity desc",meds.class).setMaxResults(4).getResultList();
    }
    public List<meds> find2(){
    return im.createQuery("select m from meds m where m.price is not null and m.price <> 'Просим уточнять стоимость в аптеке' order by m.price desc",meds.class).setMaxResults(4).getResultList();
    }
    public List<meds> findS(String meds){

    return im.createQuery("select m from meds m where m.name like :medsname ",meds.class).setParameter("medsname","%"+meds+"%").getResultList();
    }
}
