package com.codinghub.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//table
@Table//we can rename table
public class Institute
{
	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", location=" + location + ", fee=" + fee + ", faculty="
				+ faculty + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	@Id //we have to give this to avoid errors
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String location;
	@Column(nullable=false)
	private Double fee;
	@Column(nullable=false)
	private String faculty;
}