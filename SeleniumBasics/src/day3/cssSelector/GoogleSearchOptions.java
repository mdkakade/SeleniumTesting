package day3.cssSelector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchOptions {

	public static void main(String[] args) {
		String driverExePath=".//Executables/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium interview questions");
		
		List<WebElement> a=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>div:first-child>span"));
		System.out.println(a.size());
		for(int i=0; i<a.size(); i++) {
		System.out.println(a.get(i).getText());
		}
		
		driver.close();

	}

}
