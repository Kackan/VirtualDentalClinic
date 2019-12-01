package com.virtualdent.service;

import java.util.List;

import com.virtualdent.entity.Doctor;

public interface DoctorService {
	
	public List<Doctor>getDoctors();
	
	public Doctor getDoctor(int id);
	
	public void saveDoctor(Doctor doctor);
	
	public void deleteDoctor(int id);
	
	public List<Doctor>search(String keyword);
}
