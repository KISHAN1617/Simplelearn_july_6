package in.swiggy.teststeps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter  extends Tools{
	@Before
	public void setUp(Scenario scensrio) {
		Driver.init();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
