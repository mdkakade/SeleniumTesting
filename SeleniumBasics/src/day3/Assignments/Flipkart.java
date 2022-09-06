package day3.Assignments;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		String driverExePath=".//Executables/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
		System.out.println(driver.getTitle()); 
		String aUrl=driver.getCurrentUrl();
		String eUrl="https://www.flipkart.com/";
		System.out.println("Url Verification: "+aUrl.equals(eUrl));
		
		List<WebElement> c=driver.findElements(By.cssSelector("div._37M3Pb>div>a"));
		System.out.println(c.size());
//		Iterator itr = c.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for(int i=0;i<c.size();i++) {
			System.out.println(c.get(i).getText());
				
		}
		
		driver.close();

	}

}
