package fr.formation.inti.beans;

public class HelloBean {

	public HelloBean() {
	}
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public static HelloBean createInstance() {
		System.out.println("HelloBean créé");
		return new HelloBean();
	}
}