package com.absi.jaxwsaddrbook.webapp;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class Address
{
	@NotNull
	@Size(max = 100)
	private String streetVillage;
	public void setStreetVillage(String sv) { this.streetVillage = sv; }
	public String getStreetVillage() { return this.streetVillage; }

	@NotNull
	private int number;
	public void setNumber(int n) { this.number = n; }
	public int getNumber() { return this.number; }

	@NotNull
	@Size(max = 10)
	private String zipCode;
	public void seZipCode(String zip) { this.zipCode = zip; }
	public String getZipCode() { return this.zipCode; }

	@NotNull
	@Size(max = 100)
	private String city;
	public void setCity(String c) { this.city = c; }
	public String getCity() { return this.city; }


	public Address() {}

	public Address(String streetVillage, int number, String zipCode, String city)
	{
		this.streetVillage = streetVillage;
		this.number = number;
		this.zipCode = zipCode;
		this.city = city;
	}

	public String toString()
	{
		return this.streetVillage + " " + this.number + " " + this.zipCode + " " + this.city;
	}
}