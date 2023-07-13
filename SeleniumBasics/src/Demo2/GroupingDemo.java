package Demo2;

import org.testng.annotations.Test;

public class GroupingDemo {
	@Test(groups="Luxury cars")
	public void car1() {
		System.out.println("Mercedes");
	}
	@Test(groups="Luxury cars")
	public void car2() {
		System.out.println("BMW");
	}
	@Test(groups={"car","Luxury cars"})
	public void car3() {
		System.out.println("Toyato");
	}
	@Test(groups="car")
	public void car4() {
		System.out.println("Hyundai");
	}
	@Test(groups="car")
	public void car5() {
		System.out.println("Mahindra");
	}


}