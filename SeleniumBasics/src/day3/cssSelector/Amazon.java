package day3.cssSelector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		String driverExePath=".//Executables/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> b=driver.findElements(By.cssSelector("#nav-xshop-container>div#nav-xshop>a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {
		System.out.println(b.get(i).getText());
		}
		driver.findElement(By.linkText("Amazon Pay")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println("Amazon Pay Title validation: "+driver.getTitle().equals("Amazon Pay"));
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle().contains("Online Shopping site in India"));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle().contains("Books Online"));
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
