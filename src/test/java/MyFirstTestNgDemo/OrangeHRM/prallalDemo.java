package MyFirstTestNgDemo.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class prallalDemo {
	WebDriver driver;

	@BeforeMethod
	public void Browser() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Test
	public void get() throws InterruptedException {

		driver.get( "https://www.facebook.com/login.php/");
		

	}
	@Test
	public void get1() throws InterruptedException {

		driver.get("https://www.instagram.com/?hl=en" );



	
	}

	@AfterMethod
	public void name() {
		driver.close();

	}

}
