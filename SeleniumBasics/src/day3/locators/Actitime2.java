package day3.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime2 {

	public static void main(String[] args) {
		String exepath=".\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String aURL=driver.getCurrentUrl();
		System.out.println("URL validatio: "+aURL.equals("https://demo.actitime.com/login.do"));
		String aTitle=driver.getTitle();
		System.out.println("Totle Validation: "+aTitle.equals("actiTIME - Login"));
		int pglength=driver.getPageSource().length();
		System.out.println(pglength);
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys("manager");
		WebElement submit=driver.findElement(By.className("initial"));
		submit.click();
		driver.close();
		
		
		
	}

}
