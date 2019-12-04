package com.virtualdent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.virtualdent.entity.Patient;
import com.virtualdent.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repo;
	
	@Override
	public List<Patient> getPatients() {
		return repo.findAll();
	}

	@Override
	public Patient getPatient(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void savePatient(Patient patient) {
		repo.save(patient);
	}

	@Override
	public void deletePatient(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Patient> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
