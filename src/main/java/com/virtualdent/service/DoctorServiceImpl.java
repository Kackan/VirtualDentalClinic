package com.virtualdent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtualdent.entity.Doctor;
import com.virtualdent.repository.DoctorRepository;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository repo;
	
	@Override
	public List<Doctor> getDoctors() {
		return repo.findAll();
	}

	@Override
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub		
	}

	@Override
	public List<Doctor> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
