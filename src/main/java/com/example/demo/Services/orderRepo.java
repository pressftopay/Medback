package com.example.demo.Services;

import com.example.demo.entity.orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepo extends JpaRepository<orders,Long> {
    orders save(orders orders);
}
