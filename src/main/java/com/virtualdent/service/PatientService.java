package com.virtualdent.service;

import java.util.List;

import com.virtualdent.entity.Patient;

public interface PatientService {
	
	public List<Patient> getPatients();
	
	public Patient getPatient(int id);
	
	public void savePatient(Patient patient);
	
	public void deletePatient(int id);
	
	public List<Patient>search(String keyword);
	
}
