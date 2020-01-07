package com.virtualdent.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pacjent")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Visit visitDay;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int number;
	
	@Column
	private String address;
	
	public Patient() {
		
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
	
	public Visit getVisitDay() {
		return visitDay;
	}

	public void setVisitDay(Visit visitDay) {
		
		if(sameAsFormer(visitDay))
		{
			return;
		}
		
		Visit oldVisit=this.visitDay;
		this.visitDay=visitDay;
		
		/*if(oldVisit!=null)
		{
			oldVisit.setPatient(null);
		}
		if(visitDay!=null) {
			visitDay.setPatient(this);
		}*/
	}
	
	private boolean sameAsFormer(Visit visit)
	{
		return visitDay== null?
				visit==null : visitDay.equals(visit);
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
		result = prime * result + ((visitDay == null) ? 0 : visitDay.hashCode());
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
		Patient other = (Patient) obj;
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
		if (visitDay == null) {
			if (other.visitDay != null)
				return false;
		} else if (!visitDay.equals(other.visitDay))
			return false;
		return true;
	}
}