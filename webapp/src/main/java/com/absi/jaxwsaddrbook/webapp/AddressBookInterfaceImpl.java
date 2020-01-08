package com.absi.jaxwsaddrbook.webapp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.List;
import javax.ejb.EJB;

@WebService(name = "AddressBookInterface")
public class AddressBookInterfaceImpl implements AddressBookInterface
{

	@EJB
	private SimpleAddressBookBean addressBook;

	@EJB
	private PersonDAO persondao;

	@Override
	@WebMethod
	public String serviceCheck() { return "Service online ..."; }

	@Override
	@WebMethod
	public List<Person> getWholeBook()
	{
		//return addressBook.getAllPersons();
		return persondao.getAllPersons();
	}

	@WebMethod
	public String getWholeBookAsString()
	{
		return persondao.getAllPersonsAsString();
	}

	@Override
	@WebMethod
	public void addPerson(Person person)
	{
		persondao.createNewPerson(person);
	}

	@Override
	@WebMethod
	public Person findPerson(String name, String sureName)
	{
		return addressBook.getPerson(name, sureName);
	}

	@Override
	@WebMethod
	public List<Person> findPersons(String name)
	{
		return addressBook.getPersons(name);
	}
}