package day2.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserGeneric3 {

	public static void main(String[] args) {
	String curdir=System.getProperty("user.dir");
	String Exepath=curdir+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", Exepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
    String Title=driver.getTitle();
    System.out.println(Title);
    System.out.println(Title.length());
    String aURL=driver.getCurrentUrl();
    String eURL="https://demo.actitime.com/";
    System.out.println("Validating URL: "+aURL.contains(eURL));
    String pgsrc=driver.getPageSource();
    System.out.println(pgsrc.length());
    driver.close();

	}

}
