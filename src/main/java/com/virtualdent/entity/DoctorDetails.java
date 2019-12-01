package com.virtualdent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="szczegoly_dentysty")
public class DoctorDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int number;
	
	@Column
	private String specialization;

	
	
	
	public DoctorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public DoctorDetails(String firstName, String lastName, int number, String specialization) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.specialization = specialization;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "DoctorDetails [firstName=" + firstName + ", lastName=" + lastName + ", number=" + number
				+ ", specialization=" + specialization + "]";
	}

}