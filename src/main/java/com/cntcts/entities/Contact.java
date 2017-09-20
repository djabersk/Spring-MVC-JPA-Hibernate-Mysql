package com.cntcts.entities;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Contact implements Serializable {
	@Id @GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String function;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String firstName, String lastName, int yearOfBirth, String function, String address, String city,
			String country, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.function = function;
		this.address = address;
		this.city = city;
		this.country = country;
		this.email = email;
	}
	private String address;
	private String city;
	private String country;
	private String email;
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
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	

}
