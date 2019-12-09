package com.virtualdent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.virtualdent.entity.Dentist;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Integer> 
{
	
}