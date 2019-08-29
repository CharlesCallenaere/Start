package fr.formation.inti;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.beans.HelloBean;

public class App
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
    	HelloBean hb = context.getBean("hello",HelloBean.class);
//    	hb.hello();
    	context.close();
    }
}