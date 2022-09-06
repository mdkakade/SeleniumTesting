package day4.browserOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserOperations {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\PropertyFiles\\appData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String driverKey=prop.getProperty("driverKey");
		String exePath=prop.getProperty("exePath");
		String appUrl=prop.getProperty("appUrl");
		String userName=prop.getProperty("userName");
		String password=prop.getProperty("password");
	
		System.setProperty(driverKey, exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("appUrl"));
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println(userNameInputField.isDisplayed());
		System.out.println(userNameInputField.isEnabled());
		userNameInputField.sendKeys(userName);
		
		WebElement pwd=driver.findElement(By.name("pwd"));
		System.out.println(pwd.isDisplayed());
		System.out.println(pwd.isEnabled());
		pwd.sendKeys(password);
		
		driver.findElement(By.id("loginButton")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().setSize(new Dimension (400,500));
		driver.close();
		
		

	}

}
