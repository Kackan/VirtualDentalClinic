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
import javax.persistence.Table;

@Entity
@Table(name="wizyta")
public class Visit implements Serializable {
	
	private static final long serialVersionUID = -135088128548004469L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@Column
	private String day;
	
	@Column
	private String time;
	
	@ManyToMany(cascade={CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH}, fetch=FetchType.EAGER)
	private List<Dentist>dentists;

	public Visit() {}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<Dentist> getDentists() {
		return dentists;
	}

	public void setDentists(List<Dentist> dentists) {
		this.dentists = dentists;
	}

	@Override
	public String toString() {
		return "Visit [id=" + id + ", day=" + day + ", time=" + time +"]";
	}

	
	public void addDentist(Dentist dentist)
	{
		if(dentists==null)
		{
			dentists=new ArrayList<>();
		}
		dentists.add(dentist);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((dentists == null) ? 0 : dentists.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Visit other = (Visit) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (dentists == null) {
			if (other.dentists != null)
				return false;
		} else if (!dentists.equals(other.dentists))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	
	
}