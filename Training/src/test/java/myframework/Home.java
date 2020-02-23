package myframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy (xpath = "//*[@id=\"email\"]")
	WebElement email;
	@FindBy (xpath = "//*[@id=\"pass\"]")
	WebElement password;
	
	public Home (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendKeyToEmail ()
	{
		email.sendKeys("Naimi@gmail.com");
	}
	public void sendKeyToPassword () {
	password.sendKeys("2323232323");
	
}
	}
	
	