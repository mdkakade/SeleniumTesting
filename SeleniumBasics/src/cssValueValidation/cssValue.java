package cssValueValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssValue {

	public static void main(String[] args) {
		String driverExePath = ".//Executables/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://courses.letskodeit.com/practice");
		
		//Radio Button Example validation
		WebElement radioBtnEx=driver.findElement(By.cssSelector("#radio-btn-example legend"));
		System.out.println("RadioBtn color"+radioBtnEx.getCssValue("color"));
		System.out.println("RadioBtn font size"+radioBtnEx.getCssValue("font-size"));
		System.out.println("RadioBtn backgrond color"+radioBtnEx.getCssValue("background-color"));
		
		//disabled-button validation
		WebElement disabledButton=driver.findElement(By.id("disabled-button"));
		System.out.println("DisabledButton color"+disabledButton.getCssValue("color"));
		System.out.println("DisabledButton font size"+disabledButton.getCssValue("font-size"));
		System.out.println("DisabledButton backgrond color"+disabledButton.getCssValue("background-color"));
		
		//#enabled-example-div legend validation
		WebElement enabledEx=driver.findElement(By.cssSelector("#enabled-example-div legend"));
		System.out.println("EnabledEx color"+enabledEx.getCssValue("color"));
		System.out.println("EnabledEx font size"+enabledEx.getCssValue("font-size"));
		System.out.println("EnabledEx backgrond color"+enabledEx.getCssValue("background-color"));
		
		//HOME validation
		WebElement home=driver.findElement(By.cssSelector(".dynamic_menu_texts li[data-id=\"41188\"]"));
		System.out.println("Home color"+home.getCssValue("color"));
		System.out.println("Home font size"+home.getCssValue("font-size"));
		System.out.println("Home backgrond color"+ home.getCssValue("background-color"));
		
		//Location validation
		Point homeLocation=home.getLocation();
		int homeLocationX=homeLocation.getX();
		int homeLocationY=homeLocation.getY(); 
		System.out.println(homeLocation.getX());
		System.out.println(homeLocation.getY());
		
		Point radioBtnExLocation=radioBtnEx.getLocation();
		int radioX=radioBtnExLocation.getX();
		int radioY=radioBtnExLocation.getY();
		System.out.println(radioBtnExLocation.getX());
		System.out.println(radioBtnExLocation.getY());
		
		System.out.println("Is Home displayed above radio btn :"+(radioY>homeLocationY));
		
		System.out.println("Is home on left of radio btn :"+(homeLocationX<radioX));
		
		driver.close();

	}

}
