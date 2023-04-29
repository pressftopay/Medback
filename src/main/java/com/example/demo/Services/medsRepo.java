package com.example.demo.Services;


import com.example.demo.entity.meds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface medsRepo extends JpaRepository<meds,Integer> {
        meds save(meds drug);




        @Query("select m from meds m")
        List<meds> findAll();

        meds findByName(@Param("name") String name);


        List<meds> findByNameStartingWith(@Param("name") String name);
        meds findAllByName(String name);
        meds findByID(long ID);

        
}
