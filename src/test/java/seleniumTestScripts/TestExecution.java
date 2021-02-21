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
		
		if(applicationName.equalsIgnoreCase("Facebook")) {
			int a=10;
			if(a%2==0) {
				System.out.println("Give number is even");
			}else {
				System.out.println("Given number is odd");
			}
		}else if(applicationName.equalsIgnoreCase("Google")) {
			int a=10, b=20;
			System.out.println(a+b);
		}else {
			int a=5;
			System.out.println("Cube of the given number is:"+a);
		}
	}
}
