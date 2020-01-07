package com.virtualdent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtualdent.entity.Visit;

@Repository
public interface VisitRepo extends JpaRepository<Visit, Integer>{	
}
