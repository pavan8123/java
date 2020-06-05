package com.example.socrecard.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scorecard {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String name;
	String country;
	int fours;
	int sixes;
	Date dob;
	public Scorecard() {
		super();
	}
	public Scorecard(int id, String name, String country, int fours, int sixes, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.fours = fours;
		this.sixes = sixes;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
