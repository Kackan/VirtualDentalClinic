package com.virtualdent.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dentysta")
public class Doctor {

	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private DoctorDetails doctorDetail;
	
	@OneToMany(mappedBy="doctor",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Patient>patients;

	
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DoctorDetails getDoctorDetail() {
		return doctorDetail;
	}

	public void setDoctorDetail(DoctorDetails doctorDetail) {
		this.doctorDetail = doctorDetail;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorDetail=" + doctorDetail + ", patients=" + patients + "]";
	}
	
	public void addPatient(Patient patient)
	{
		if(patients==null) {
		patients=new ArrayList<>();
		}
		
		patient.setDoctor(this);
		patients.add(patient);
	}
	
}