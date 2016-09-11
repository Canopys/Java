package cn.core.serivce;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.request.NativeWebRequest;

import cn.core.entity.Person;

public class ServiceTest {

	@Test
	public void testSave() {
		Person person = new Person();
		//ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		Service service = (Service) act.getBean("service");
		Service service2 = (Service) act.getBean("service");
		System.out.println(service == service2);
		service.save(person);
		//destroy is ClassPathXmlApplicationContext api, and the bean scope should be default or singleton
		act.destroy();
		
	}

}
