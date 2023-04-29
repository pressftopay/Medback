package com.example.demo.Services;

import com.example.demo.entity.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
@Service
public interface categoryRepo extends JpaRepository<category,Integer> {
    List<category> findAll();
    category save(category c);

}
