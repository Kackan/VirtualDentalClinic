package com.virtualdent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtualdent.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
