package com.example.demo.Services;

import com.example.demo.entity.cons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface consRepo extends JpaRepository<cons, Integer> {
    cons save(cons cons);

    List<cons> findAll();


}
