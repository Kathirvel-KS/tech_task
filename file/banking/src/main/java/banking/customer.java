package banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class customer {
	private String name;
	@Autowired
	@Qualifier("saving")
	private account a1;
	@Autowired
	@Qualifier("current")
	private account a2;
	public account getA2() {
		return a2;
	}
	public void setA2(account a2) {
		this.a2 = a2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public account getA1() {
		return a1;
	}
	public void setA1(account a1) {
		this.a1 = a1;
	}
	
	
	
	}

