package com.virtualdent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtualdent.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> 
{
	
}