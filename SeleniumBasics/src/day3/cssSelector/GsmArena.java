package day3.cssSelector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
		String driverExePath=".//Executables/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.gsmarena.com/");
		List<WebElement> all=driver.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li"));
		System.out.println("All :"+ all.size());
		for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}
		driver.close();
		

	}

}
