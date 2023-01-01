package day10_assign;

import java.util.Map;

import org.springframework.cglib.core.ClassLoaderAwareGeneratorStrategy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	private Map<Department, Employee> theMap;

	// use setter injection to inject theMap;
	public void myInit() {
		System.out.println("inside myInit method");
	}

	public void cleanUp() {
		System.out.println("inside cleanUp method");
	}

	public void showDetails() {
		System.out.println("inside showDetails of Demo class");
		// print all the details of all the employees department-wise.
	}

	private static ApplicationContext ClassPathXmlApplicationContext(String string) {
		ApplicationContext cp =  new ClassPathXmlApplicationContext(string);
		return cp;
	}

	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	
	public static void main(String[] args) {

		ApplicationContext apc = Demo.ClassPathXmlApplicationContext("applicationContext.xml");

		Demo dm= apc.getBean("demo", Demo.class);

		System.out.println(dm.theMap);
		dm.showDetails();
		
		ClassPathXmlApplicationContext cxa = (org.springframework.context.support.ClassPathXmlApplicationContext) apc;
cxa.close();
	}

}
