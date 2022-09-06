package day3.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li>a[href='samsung-phones-9.php']")).click();
		Thread.sleep(2000);
		List<WebElement> d=driver.findElements(By.cssSelector("div.makers>ul>li>a"));
		System.out.println(d.size());
		for(int i=0;i<d.size();i++) {
			System.out.println(d.get(i).getText());
		}
		
		List<WebElement> e=driver.findElements(By.cssSelector("div.nav-pages>a"));
		System.out.println(e.size());
		for(int i=0;i<e.size();i++) {
			System.out.println(e.get(i).getText());
		}
		List<WebElement> f=driver.findElements(By.cssSelector("div.nav-pages>strong"));
		System.out.println(f.size());
		for(int i=0;i<f.size();i++) {
			System.out.println(f.get(i).getText());
		}
		driver.close();

	}

}
