package com.virtualdent.entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DentalTreatment {
	
	private Map<Double,String>treatments;
	private List<Double>chosen;
	
	public DentalTreatment() {
	}

	public void init()
	{
		treatments=new HashMap<>();
		treatments.put(0.0,"Przegląd/WizytaKontrolna");
		treatments.put(170.0,"Wybielanie");
		treatments.put(1550.0,"Aparat dentystyczny");
		treatments.put(200.0,"Wypełnianie");
		treatments.put(190.0,"Odbudowa zęba");
		treatments.put(130.0,"Oczyszczanie");
		treatments.put(70.0,"Fluoryzacja/Konsultacja ortodontyczna");
		treatments.put(320.0,"Leczenie kanałowe");
		treatments.put(130.0,"Wizyta kontrolna ortodontyczna");
		
	}
	
	public Map<Double,String> getTreatments() {
		return treatments;
	}

	public void setTreatments(Map<Double,String> treatments) {
		this.treatments = treatments;
	}

	public List<Double> getChosen() {
		return chosen;
	}

	public void setChosen(List<Double> chosen) {
		this.chosen = chosen;
	}

}