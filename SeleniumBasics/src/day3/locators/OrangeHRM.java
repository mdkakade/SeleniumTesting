package day3.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
	String exepath=".\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String aTitle=driver.getTitle();
	String aURL= driver.getCurrentUrl();
	String eTitle="OrangeHRM";
	String eURL="https://opensource-demo.orangehrmlive.com/";
	System.out.println("URL Validation: "+aURL.equals(eURL));
	System.out.println("Title Validation: "+aTitle.equals(eTitle));
	WebElement Username=driver.findElement(By.id("txtUsername"));
	Username.sendKeys("Admin");
	WebElement pwd=driver.findElement(By.id("txtPassword"));
	pwd.sendKeys("admin123");
	WebElement Submit=driver.findElement(By.name("Submit"));
	Submit.click();
	String hpURL=driver.getCurrentUrl();
	String ehpURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	System.out.println("Homepage Validation: "+hpURL.contains(ehpURL));
	driver.close();
	
	

	}

}
