package day2.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowserGeneric {

	public static void main(String[] args) {
		String CurrentWorkingDir= System.getProperty("user.dir");
		String exePath = CurrentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String Title=driver.getTitle();
		System.out.println(Title);
		String pgsrc=driver.getPageSource();
		pgsrc.length();
		System.out.println(pgsrc.length());
		driver.close();

	}

}
