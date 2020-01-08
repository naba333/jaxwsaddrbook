package com.absi.jaxwsaddrbook.client;

import java.net.URL;
 
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import java.util.List;

import com.absi.jaxwsaddrbook.webapp.AddressBookInterface;
import com.absi.jaxwsaddrbook.webapp.AddressBookInterfaceImpl;
import com.absi.jaxwsaddrbook.webapp.Person;
//import com.absi.jaxwsaddrbook.webapp.endpoint.AddressBookInterfaceImplService;
//import com.absi.jaxwsaddrbook.webapp.AddressBookInterfaceImpl;

public class Client
{
	//@WebServiceRef(wsdlLocation = "http://localhost:8080/webapp/AddressBookInterfaceImplService?wsdl")
    //private static AddressBookInterfaceImplService addrBookService;

	public static void main(String args[]) throws Exception
	{
		URL wsdlUrl = new URL("http://localhost:8080/webapp/AddressBookInterfaceImplService?wsdl");
 
        //qualifier name ...
        QName qname = new QName("http://webapp.jaxwsaddrbook.absi.com/", "AddressBookInterfaceImplService");

		Service service = Service.create(wsdlUrl, qname);
 
        AddressBookInterface addrBookService = service.getPort(AddressBookInterface.class);  
        
        System.out.println(addrBookService.serviceCheck());
        addrBookService.addPerson(new Person("Adam", "Sandler", "asan@wp.pl"));
        addrBookService.addPerson(new Person("Cleo", "Sandler", "cleosan@wp.pl"));
        addrBookService.addPerson(new Person("Jack", "Wolfskin", "jackws@google.com"));
        addrBookService.addPerson(new Person("Ann", "Kobayashi", "anakobayashi@google.pl"));
        List<Person> persons = addrBookService.getWholeBook();
        persons.stream().forEach(p -> System.out.println(p.getName()));
        System.out.println(addrBookService.getWholeBookAsString());

        //addrBookService.getWholeBook().stream().forEach(p -> System.out.println(p.toString()));

        //AddressBookInterfaceImpl port = addrBookService.getAddressBookInterfaceImplPort();
        //port.serviceCheck();
	}

}