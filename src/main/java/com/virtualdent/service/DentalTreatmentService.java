package com.virtualdent.service;


import java.util.List;

import com.virtualdent.entity.DentalTreatment;

public interface DentalTreatmentService {
	
	public Double counter(List<Double>treatments);
		
	public DentalTreatment getDentalTreatment();
}
