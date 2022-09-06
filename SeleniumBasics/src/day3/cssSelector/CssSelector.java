package day3.cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		String driverExePath=".\\Executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com");
		String expTitle="https://www.techlistic.com/";
		String aTitle=driver.getTitle();
		System.out.println("Title Validation: "+aTitle.contains(expTitle));
		
		driver.findElement(By.cssSelector("nav[role='navigation']>div[id='page_list_top'] ul[class='tabs'] li[class=\"overflowable-item\"]>a[href=\"https://www.techlistic.com/p/java.html\"]")).click();
		Thread.sleep(10000);
		String javaEtitle="https://www.techlistic.com/p/java.html";
		String javaTitle=driver.getTitle();
		System.out.println("JAva Title Page Validation :"+javaTitle.contains(javaEtitle));
		
		driver.navigate().back();
		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(10000);
		String seleniumEtitle="https://www.techlistic.com/p/selenium-tutorials.html";
		String seleniumTitle=driver.getTitle();
		System.out.println("Selenium Title Page Validation :"+seleniumTitle.contains(seleniumEtitle));
		
		driver.close();
		
		
		

	}

}
