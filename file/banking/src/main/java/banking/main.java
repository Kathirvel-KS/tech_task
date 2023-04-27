package banking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
		customer customer=(banking.customer) context.getBean("customer");
		
		customer.getA1().saving();
		customer.getA1().withdraw();
		System.out.println("----------*******----------");
		customer.getA2().saving();
		customer.getA2().withdraw();

	}
}
