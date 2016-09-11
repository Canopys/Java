package cn.core.dao.impl;

import cn.core.dao.IDepart;
import cn.core.entity.Person;

public class Depart implements IDepart {

	@Override
	public void add(Person person) {
		System.out.println("we save!!!");

	}

}
