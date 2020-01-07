package com.virtualdent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.virtualdent.entity.DentalTreatment;

@Service
public class DentalTreatmentServiceImpl implements DentalTreatmentService{

	@Override
	public Double counter(List<Double>treatments)
	{
		Double s=0.0;	 
		for(Double d: treatments)
		{
			s=s+d;
		}
		return s;
	}
	
	@Override
	public DentalTreatment getDentalTreatment() {
		DentalTreatment treatment=new DentalTreatment();
		treatment.init();
		return treatment;
	}
}