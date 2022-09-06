package day2.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowserGeneric2 {

	public static void main(String[] args) {
		String CurrentWorkingdir=System.getProperty("user.dir");
		String exePath = CurrentWorkingdir+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String ExpectedTitle="Facebook – log in or sign up";
		String ActualTitle=driver.getTitle();
		System.out.println("Facebook Title Validation: "+ActualTitle.equals(ExpectedTitle));
		
		String ActualURL=driver.getCurrentUrl();
		String ExpectedURL = "https://www.facebook.com";
		System.out.println("Facebook URL Validation: "+ActualURL.contains(ExpectedURL));
		
		driver.close();
		
		
	}

}
