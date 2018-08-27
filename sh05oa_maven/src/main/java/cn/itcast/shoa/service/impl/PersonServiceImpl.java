package cn.itcast.shoa.service.impl;

import cn.itcast.shoa.dao.PersonDao;
import cn.itcast.shoa.domain.Person;
import cn.itcast.shoa.service.PersonService;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDao.savePerson(person);
	}
}
