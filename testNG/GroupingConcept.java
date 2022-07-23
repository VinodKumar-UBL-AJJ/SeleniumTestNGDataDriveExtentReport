package testNG;

import org.testng.annotations.Test;

public class GroupingConcept {
	
	
	
	@Test(groups="mobile")
	public void vivo() {		
		System.out.println("Mobile phone Vivo");
	}
	
	@Test(groups="mobile")
	public void onePlus() {
		System.out.println(" OnePlus phone");
	}
	
	@Test(groups="laptop")
	public void lenovo() {
		System.out.println("Laptop lenovo");
	}
	
	@Test(groups="laptop")
	public void HP() {
		System.out.println("HP Laptop");
	}
	
	@Test(groups="course")
	public void selenium() {
	System.out.println("Web application automation");
	}
	@Test(groups="course")
	public void testNG() {
		System.out.println("Execution framework");
	}
	@Test(groups="course")
	public void POM() {
		System.out.println("page object model framework");
	}
}
