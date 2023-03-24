package MyFirstTestNgDemo.OrangeHRM;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class MultipleLogin {
	WebDriver driver;

	@AfterMethod
	public void after() {
		driver.close();

		
	}

	@DataProvider(name = "set1")

	public Object[][] data() {
		return new Object[][] {

				{ "makesh", "fansam" }, { "raja", "ramu" }

		};

	}

	@org.testng.annotations.Test(dataProvider = "set1")

	public void LoginPage(String user, String pass) throws InterruptedException {

		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys(user);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//span[text()='Admin']")).click();

	}

	@BeforeMethod
	public void web() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
}
