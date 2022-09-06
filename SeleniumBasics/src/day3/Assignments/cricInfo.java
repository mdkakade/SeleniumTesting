package day3.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cricInfo {

	public static void main(String[] args) {
		String driverExePath=".//Executables/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverExePath);
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().setSize(new Dimension (400,500));
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		List<WebElement> optionList=driver.findElements(By.cssSelector("div[class='ds-flex ds-flex-row']>div>a"));
		System.out.println(optionList.size());
		for(WebElement options : optionList) {
			System.out.println(options.getText());
		}
		driver.close();
	}

}
