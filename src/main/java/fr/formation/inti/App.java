package fr.formation.inti;

import fr.formation.inti.beans.HelloBean;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//    	AbstractApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//    	HelloBean hb = context.getBean("hello",HelloBean.class);
//    	hb.hello();
    	System.out.println(1);
    	HelloBean a = HelloBean.createInstance();
//    	context.close();
    }
}