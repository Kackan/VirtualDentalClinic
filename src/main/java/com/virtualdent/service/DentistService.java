package com.virtualdent.service;

import java.util.List;

import com.virtualdent.entity.Dentist;

public interface DentistService {
	
	public List<Dentist>getDentists();
	
	public Dentist getDentist(int id);
	
	public void saveDentist(Dentist dentist);
	
	public void deleteDentist(int id);
	
	public List<Dentist>search(String keyword);
}
