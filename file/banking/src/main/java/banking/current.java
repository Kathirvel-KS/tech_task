package banking;

import org.springframework.stereotype.Component;

@Component
public class current implements account {

	public void saving() {
		System.out.println("deposited successfully in current account");
		
	}

	public void withdraw() {
		System.out.println("withdraw successfully in current account");
		
	}

}
