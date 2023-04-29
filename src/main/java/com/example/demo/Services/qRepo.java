package com.example.demo.Services;

import com.example.demo.entity.questionnary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface qRepo extends JpaRepository<questionnary,Integer> {
    questionnary save(questionnary q);


    List<questionnary> findAll();
}
