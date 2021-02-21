package seleniumTestScripts;

import org.testng.annotations.Test;

public class TestExecution {
	@Test
	public void test1() {
		String applicationName=System.getProperty("applicationName");
		String userName=System.getProperty("userName");
		String password=System.getProperty("password");
		
		System.out.println("Application Name is :"+applicationName);
		System.out.println("userName Name is :"+userName);
		System.out.println("password Name is :"+password);
	}
}
