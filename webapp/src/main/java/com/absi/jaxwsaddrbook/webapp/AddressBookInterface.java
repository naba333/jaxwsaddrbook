package com.absi.jaxwsaddrbook.webapp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.List;

@WebService
//@SOAPBinding(style = Style.DOCUMENT)
public interface AddressBookInterface
{
	@WebMethod
	public String serviceCheck();

	@WebMethod
	public List<Person> getWholeBook();

	@WebMethod
	public String getWholeBookAsString();

	@WebMethod
	public void addPerson(Person person);

	@WebMethod
	public Person findPerson(String name, String sureName);

	@WebMethod
	public List<Person> findPersons(String name);
}
