package com.virtualdent.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtualdent.entity.Visit;
import com.virtualdent.repository.VisitRepo;

@Service
@Transactional
public class VisitServiceImpl implements VisitService{

	@Autowired
	private VisitRepo visitRepo;

	@Override
	public List<Visit> getVisits() {
		return visitRepo.findAll();
	}

	@Override
	public List<Visit> getVisitsFromDentist(Integer id) {
		return null;
	}

	@Override
	public Visit getVisit(Integer id) {
		return visitRepo.findById(id).get();
	}

	@Override
	public void saveVisit(Visit visit) {
		visitRepo.save(visit);
	}

	@Override
	public void deleteVisit(Integer id) {
		System.out.println("DELETE @#$#$#$#");
		visitRepo.deleteById(id);
	}

	@Override
	public List<Visit> search(String keyword) {
		return null;
	}	
}