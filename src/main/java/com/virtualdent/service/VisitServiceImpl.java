package com.virtualdent.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.virtualdent.entity.Dentist;
import com.virtualdent.entity.Visit;
import com.virtualdent.repository.DentistRepository;
import com.virtualdent.repository.VisitRepo;

@Service
@Transactional
public class VisitServiceImpl implements VisitService{

	@Autowired
	private VisitRepo visitRepo;
	
	@Autowired
	private DentistRepository dentistRepo;

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
	public void deleteVisit(String idD, String idV) {
		Integer idDentist=Integer.parseInt(idD);
		Integer idVisit=Integer.parseInt(idV);
		Dentist dentist=dentistRepo.findById(idDentist).get();
		Visit visit=getVisit(idVisit);
		List<Visit>visits=dentist.getVisits();
		visits.remove(visit);
		visitRepo.deleteById(idVisit);
	}
	
	public Map<String,Integer> editVisit(String idV, String idD)
	{
		Map<String,Integer>map=new HashMap<>();
		Integer idDentist=Integer.parseInt(idD);
		Integer idVisit=Integer.parseInt(idV);
		map.put("dentist", idDentist);
		map.put("visit", idVisit);
		return map;
	}
	
	
	@Override
	public List<Visit> search(String keyword) {
		return null;
	}	
}