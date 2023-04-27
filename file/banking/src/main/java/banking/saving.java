package banking;

import org.springframework.stereotype.Component;

@Component
public class saving implements account {

	public void saving() {
		System.out.println("deposited successfully in saving account");
		
	}

	public void withdraw() {
		System.out.println("withdraw successfully in saving account");
		
	}

}
