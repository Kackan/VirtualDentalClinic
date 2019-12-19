package com.virtualdent.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="dentysta")
public class Dentist implements Serializable{

	private static final long serialVersionUID = 3128830699411486597L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String specialization;
	
	@Column
	private int number;
	
	@Column
	private String address;
	
	@OneToMany(mappedBy="dentist",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.EAGER)
	private List<Patient>patients;
	
	@ManyToMany(mappedBy="dentists", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Visit>visits;
	
	public Dentist() {
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public List<Patient> getPatients() {
		return patients;
	}


	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

	public void addPatient(Patient patient)
	{
		System.out.println("DENTIST=PATIENT+ADDER");
		
		if(patients==null) {
		patients=new ArrayList<>();
		}
		
		patient.setDentist(this);
		patients.add(patient);
	}
	
	public void addVisit(Visit visit)
	{
		if(visits==null)
		{
			visits=new ArrayList<>();
		}
		visit.addDentist(this);
		visits.add(visit);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + number;
		result = prime * result + ((patients == null) ? 0 : patients.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		result = prime * result + ((visits == null) ? 0 : visits.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentist other = (Dentist) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (number != other.number)
			return false;
		if (patients == null) {
			if (other.patients != null)
				return false;
		} else if (!patients.equals(other.patients))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		if (visits == null) {
			if (other.visits != null)
				return false;
		} else if (!visits.equals(other.visits))
			return false;
		return true;
	}

}