package day3.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime3 {

	public static void main(String[] args) throws InterruptedException {
		String exepath=".\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
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
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("div.title.ellipsis")).click();
		driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		//driver.findElement(By.linkText("Android testing")).click();
		driver.findElement(By.cssSelector(".projectSelector .searchItemList>.itemRow:nth-of-type(5)")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("tbody>tr:nth-of-type(1)>td.nameCell.first>input")).sendKeys("selenium testing3");
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder [class='components_button_label']")).click();
		driver.findElement(By.cssSelector("table.createdTasksRowsTable div.checkbox.inactive")).click();
		driver.findElement(By.cssSelector("div.delete.button")).click();
		driver.findElement(By.cssSelector(".deleteDialog .buttonsContainer .submitBtn:first-child .buttonIcon:nth-of-type(1)")).click();
	
		driver.close();
		
		
		
	}

}
