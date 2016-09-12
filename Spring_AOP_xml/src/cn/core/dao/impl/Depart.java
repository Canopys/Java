package cn.core.dao.impl;

import org.springframework.stereotype.Component;

import cn.core.dao.IDepart;
import cn.core.entity.Person;

@Component("depart1")
public class Depart implements IDepart {

	@Override
	public void add(Person person) {
		System.out.println("we save!!!");

	}

}
