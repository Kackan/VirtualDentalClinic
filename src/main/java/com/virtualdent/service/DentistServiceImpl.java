package com.virtualdent.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualdent.entity.Dentist;
import com.virtualdent.repository.DentistRepository;

@Service
@Transactional
public class DentistServiceImpl implements DentistService{

	@Autowired
	private DentistRepository repo;

	@Override
	public List<Dentist> getDentists() {
		return repo.findAll();
	}

	@Override
	public Dentist getDentist(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void saveDentist(Dentist dentist) {
		repo.save(dentist);
	}

	@Override
	public void deleteDentist(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<Dentist> search(String keyword) {
		return null;
	}
}