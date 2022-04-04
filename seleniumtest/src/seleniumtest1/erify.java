package seleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class erify {
	@Test
	void hello()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\madih\\Downloads\\selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");

	WebElement id=driver.findElement(By.linkText("Create New Account"));
//id.isDisplayed();
	id.click();
String a=driver.getTitle();
String b="Google";
Assert.assertEquals(a, b);
System.out.println(a);
driver.close();
	}
}
