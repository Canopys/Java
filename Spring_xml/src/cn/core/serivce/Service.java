package cn.core.serivce;

import com.sun.xml.internal.org.jvnet.fastinfoset.VocabularyApplicationData;

import cn.core.dao.IDepart;
import cn.core.entity.Person;

public class Service {
	private IDepart depart;

	public Service() {
		
	}
	
	public Service(IDepart depart) {
		this.depart = depart;
	}

	public IDepart getDepart() {
		return depart;
	}

	public void setDepart(IDepart depart) {
		this.depart = depart;
	}
	
	public void save(Person person) {
		depart.add(person);
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
