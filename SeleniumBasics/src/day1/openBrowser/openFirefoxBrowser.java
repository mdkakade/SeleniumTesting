package day1.openBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Software testing\\Workspace\\SeleniumBasics\\Executables\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.google.com");
		fdriver.close();
		

	}

}