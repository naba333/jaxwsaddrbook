package com.absi.jaxwsaddrbook.webapp;

import java.util.List;
import java.util.ArrayList;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.NoSuchElementException;


@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Startup
@Singleton
public class SimpleAddressBookBean
{
	private List<Person> addressBook;

	@PostConstruct
	public void init()
	{
		this.addressBook = new ArrayList<>();
		this.addressBook.add(new Person("Arnie", "Lee", "arniel@google.com"));
		this.addressBook.add(new Person("Daniel", "Craig", "danielcr@wp.pl"));
		this.addressBook.add(new Person("Betty", "Lacroix", "betty123@google.com"));
	}

	public SimpleAddressBookBean() {}

	@Lock(LockType.READ)
	public List<Person> getAllPersons() { return this.addressBook; }

	@Lock(LockType.READ)
	public Person getPerson(String name, String sureName)
	{
		try
		{
			return this.addressBook.stream().filter(p -> p.getName().equals(name) && p.getSureName().equals(sureName)).findFirst().get();
		}
		catch(NoSuchElementException e)
		{
			return new Person("Empty", "Empty", "Empty");
		}
	}

	@Lock(LockType.READ)
	public List<Person> getPersons(String name)
	{
		return this.addressBook.stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList());
	}

	/*
	@Lock(LockType.WRITE)
	public String setEmail(String n, String sn, String email)
	{
		Optional o = addressBook.stream().filter(x -> x.getName().equals(n) && x.getSureName().equals(sn) ).findFirst();
		if(o.isPresent())
		{
			((Person)o.get()).setEmail(email);
			return "ok";
		}
		else
			return "error";
	}
	*/
}