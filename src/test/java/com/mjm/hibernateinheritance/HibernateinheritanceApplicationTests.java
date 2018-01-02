package com.mjm.hibernateinheritance;

import com.mjm.hibernateinheritance.entities.Check;
import com.mjm.hibernateinheritance.entities.CreditCard;
import com.mjm.hibernateinheritance.repos.PaymentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateinheritanceApplicationTests {

	@Autowired
	private PaymentRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createCardPayment(){
		CreditCard cc = new CreditCard();
		cc.setId(123);
		cc.setAmount(1000.0d);
		cc.setCardnumber("123456789");
		repository.save(cc);

	}

	@Test
	public void createCheckPayment(){
		Check ch = new Check();
		ch.setId(124);
		ch.setAmount(1000.0d);
		ch.setChecknumber("123456789");
		repository.save(ch);

	}
}
