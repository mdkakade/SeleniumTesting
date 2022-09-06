package day1.openBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class openChromeBrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Software testing\\Workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
	ChromeDriver cdriver=new ChromeDriver();
	cdriver.get("https://www.google.com");
	cdriver.close();
	

	}

}
