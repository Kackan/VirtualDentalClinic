package com.virtualdent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="szczegoly_pacjenta")
public class PatientDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int number;

	
	
	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientDetails(String firstName, String lastName, int number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PatientDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", number=" + number
				+ "]";
	}
}
