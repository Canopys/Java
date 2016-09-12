package cn.core.serivce;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.core.entity.Person;

public class ServiceTest {

	@Test
	public void testSave() {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		
		Service service = (Service) act.getBean("service");
		service.save(new Person());
	}

}
