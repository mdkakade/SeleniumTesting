package day3.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {

	public static void main(String[] args) {
		//Step1: Using WebDriverManager setUp the required browser executable file
//				WebDriverManager.chromedriver().setup();
//				// step2: create an instance of Chrome Browser
//				WebDriver driver = new ChromeDriver();
//				
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driver.manage().window().maximize();
//				//to enter required application URL use get() of WebDriver interface
//				driver.get("https://demo.actitime.com");
				
		String exepath=".\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exepath);
		WebDriver driver=new FirefoxDriver();
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
