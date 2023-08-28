package testcases;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.P1_HomePage;

public class TC_01_HomePageTest extends Base {

	@Test
	public void call() throws InterruptedException {
		P1_HomePage homePage = new P1_HomePage();
		//homePage.permission_allow();
		homePage.clikbutton();
		Thread.sleep(20000);
	}

}
