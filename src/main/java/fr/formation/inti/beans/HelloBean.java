package fr.formation.inti.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloBean {
	
	@Autowired
	@Qualifier("messageBean")
	private MessageBean m;
	
	public MessageBean getM() {
		return m;
	}

	public void setM(MessageBean m) {
		this.m = m;
	}

	public HelloBean() {
		m.getMess();
	}
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public static HelloBean createInstance() {
		System.out.println("HelloBean créé");
		return new HelloBean();
	}
}