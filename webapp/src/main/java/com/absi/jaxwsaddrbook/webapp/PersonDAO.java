package com.absi.jaxwsaddrbook.webapp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

@Stateless
public class PersonDAO
{
	@PersistenceContext(unitName = "addressbookPU")
	private EntityManager em;

	public List<Person> getAllPersons()
	{
		//return em.createQuery("select p from Person p", Person.class).getResultList();
		List<Person> book;
		//book.add(new Person("Arnie", "Lee", "arniel@google.com"));
		//book.add(new Person("Daniel", "Craig", "danielcr@wp.pl"));
		//book.add(new Person("Betty", "Lacroix", "betty123@google.com"));
		book = em.createQuery("select p from Person p", Person.class).getResultList();
		return book;
	}

	public String getAllPersonsAsString()
	{
		List<Person> persons = em.createQuery("select p from Person p", Person.class).getResultList();
		StringBuilder psb = new StringBuilder();
		for(Person p: persons)
		{
			psb.append(p.toString() + "\n");

			if(p.getEmails() == null)
			{
				psb.append("\temails null\n");
			}
			else
			{
				if(p.getEmails().isEmpty())
					psb.append("\tno emails\n");
				else
				{
					for(String e: p.getEmails())
						psb.append("\t" + e + "\n");
				}
			}

			if(p.getAddresses() == null)
				psb.append("\taddresses null\n");
			else
			{
				if(p.getAddresses().isEmpty())
					psb.append("\tno addresses\n");
				else
					for(Address a: p.getAddresses())
					{
						psb.append("\t" + a.toString() + "\n");
					}
			}
		}

		return psb.toString();
	}

	public void createNewPerson(Person newPerson)
	{
		em.persist(newPerson);
		em.flush();
		//return em.createQuery("select o from Order o").getResultList();
	}

}