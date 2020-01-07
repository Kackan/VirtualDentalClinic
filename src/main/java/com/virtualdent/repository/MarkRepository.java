package com.virtualdent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtualdent.entity.Mark;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Integer> {

}
