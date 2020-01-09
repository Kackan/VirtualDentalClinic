package com.virtualdent.service;

import java.util.List;
import com.virtualdent.entity.Visit;

public interface VisitService 
{
	
	public List<Visit> getVisits();
	
	public List<Visit> getVisitsFromDentist(Integer id);
	
	public Visit getVisit(Integer id);
	
	public void saveVisit(Visit visit);
	
	public void deleteVisit(String idD, String idV);
	
	public List<Visit>search(String keyword);
	
}
