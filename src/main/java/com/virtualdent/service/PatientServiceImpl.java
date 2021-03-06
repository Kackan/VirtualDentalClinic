package com.virtualdent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtualdent.entity.Patient;
import com.virtualdent.repository.PatientRepository;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repo;
	
	@Override
	public List<Patient> getPatients() {
		return repo.findAll();
	}

	@Override
	public Patient getPatient(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void savePatient(Patient patient) {
		repo.save(patient);
	}

	@Override
	public void deletePatient(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<Patient> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
}