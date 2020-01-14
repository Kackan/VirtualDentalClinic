package com.virtualdent.service;

import java.util.List;
import java.util.Map;

import com.virtualdent.entity.Visit;

public interface VisitService 
{
	public List<Visit> getVisits();
	
	public List<Visit> getVisitsFromDentist(Integer id);
	
	public Visit getVisit(Integer id);
	
	public void saveVisit(Visit visit);
	
	public void deleteVisit(String idD, String idV);
	
	public Map<String,Integer> editVisit(String idV, String idD);
	
	public List<Visit>search(String keyword);
}
