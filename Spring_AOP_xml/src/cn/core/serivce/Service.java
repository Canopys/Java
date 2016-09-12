package cn.core.serivce;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.xml.internal.org.jvnet.fastinfoset.VocabularyApplicationData;

import cn.core.dao.IDepart;
import cn.core.entity.Person;

@Component("service")
@Scope("singleton")
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

/*	@Autowired
	public void setDepart(@Qualifier("depart1")IDepart depart) {
		this.depart = depart;
	}*/
	
	@Resource(name="depart1")
	public void setDepart(IDepart depart) {
		this.depart = depart;
	}
	
	public void save(Person person) {
		depart.add(person);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
