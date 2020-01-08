package com.absi.jaxwsaddrbook.webapp;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "persons")
public class Person
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotNull
	@Size(max = 100)
	private String name;

	@NotNull
	@Size(max = 100)
	private String sureName;

	@ElementCollection
    @CollectionTable(name = "user_emails", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "email")
    private List<String> emails = new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "addresses", joinColumns = @JoinColumn(name = "user_id"))
    private List<Address> addresses = new ArrayList<>();


	public void setName(String n) { this.name = n; }
	public String getName() { return this.name; }

	public void setSureName(String sn) { this.sureName = sn; }
	public String getSureName() { return this.sureName; }

	public void setEmails(List<String> emails) { this.emails = emails; }
	public List<String> getEmails() { return this.emails; }

	public void setAddresses(List<Address> addresses) { this.addresses = addresses; }
	public List<Address> getAddresses() { return this.addresses; }

	public Person()
	{
	}

	public Person(String name, String sureName, List<String> emails, List<Address> addresses)
	{
		this.name = name;
		this.sureName = sureName;
		this.emails = emails;
		this.addresses = addresses;
	}


	public Person(String name, String sureName, String email)
	{
		this.name = name;
		this.sureName = sureName;
		this.emails.add(email);
		this.addresses.add(new Address("ExampleRoad", 33, "99-999", "ExampleCity"));
	}

	public String toString()
	{
		return this.name + " " + this.sureName;
	}
}