package day5.dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSite2 {

	public static void main(String[] args) {
		String driverExePath = ".//Executables/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skillOptions = driver.findElement(By.id("Skills"));
		Select skillOpt = new Select(skillOptions);
		System.out.println("Is the dropdown multiselect: " + skillOpt.isMultiple());

		WebElement selectedOpt = skillOpt.getFirstSelectedOption();
		System.out.println(selectedOpt.getText());

		List<WebElement> allOpt = skillOpt.getOptions();
		System.out.println("Total options: " + allOpt.size());
		for (int i = 0; i < allOpt.size(); i++) {
			System.out.println(allOpt.get(i).getText());
		}

		skillOpt.selectByIndex(0);
		System.out.println(skillOpt.getFirstSelectedOption().getText());
		skillOpt.selectByValue("Analytics");
		System.out.println(skillOpt.getFirstSelectedOption().getText());
		skillOpt.selectByVisibleText("Backup Management");
		System.out.println(skillOpt.getFirstSelectedOption().getText());

		// Year Dropdown Validation
		WebElement yearDropdown = driver.findElement(By.id("yearbox"));
		Select yearOptions = new Select(yearDropdown);
		System.out.println("Is year dropdown multiselect: " + yearOptions.isMultiple());

		WebElement first = yearOptions.getFirstSelectedOption();
		System.out.println("First slected option: " + first.getText());

		List<WebElement> yearList = yearOptions.getOptions();
		System.out.println(yearList.size());
		for (int i = 0; i < yearList.size(); i++) {
			System.out.println(yearList.get(i).getText());
		}
		List<String> actualList=new ArrayList<String>();
		for(int i=1;i<yearList.size();i++) {
			actualList.add(yearList.get(i).getText());
		}
		System.out.println("Actual List: "+actualList);
		List<String> dupList=new ArrayList<String>();
		dupList.addAll(actualList);
		Collections.sort(dupList);
		System.out.println("Sorted List: "+dupList);
		System.out.println(dupList.equals(actualList));

//		yearOptions.selectByIndex(4);
//		System.out.println(yearOptions.getFirstSelectedOption().getText());
//		yearOptions.selectByValue("1925");
//		System.out.println(yearOptions.getFirstSelectedOption().getText());
//		yearOptions.selectByVisibleText("1930");
//		System.out.println(yearOptions.getFirstSelectedOption().getText());

		// Month Dropdown Validation
		WebElement monthDrdn = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
		Select monthOpt = new Select(monthDrdn);

		System.out.println("is month multiple dropdown: " + monthOpt.isMultiple());

		List<WebElement> MonthList = monthOpt.getOptions();
		System.out.println(MonthList.size());
		for (int i = 0; i < MonthList.size(); i++) {
			System.out.println(MonthList.get(i).getText());
		}
		List<String> actMonthList=new ArrayList<String>();
		for(int i=1; i<MonthList.size();i++) {
			actMonthList.add(MonthList.get(i).getText());
		}
		System.out.println("Actual Month List: "+actMonthList);
		List<String> dupMonthList=new ArrayList<String>();
		dupMonthList.add("January");
		dupMonthList.add("February");
		dupMonthList.add("March");
		dupMonthList.add("April");
		dupMonthList.add("May");
		dupMonthList.add("June");
		dupMonthList.add("July");
		dupMonthList.add("August");
		dupMonthList.add("September");
		dupMonthList.add("October");
		dupMonthList.add("November");
		dupMonthList.add("December");
		System.out.println("Sorted Month List: "+dupMonthList);
		System.out.println(dupMonthList.size());
		System.out.println(dupMonthList.equals(actMonthList));
//		monthOpt.selectByIndex(6);
//		System.out.println(monthOpt.getFirstSelectedOption().getText());
//		monthOpt.selectByValue("February");
//		// monthOpt.deselectByValue("February");
//		System.out.println(monthOpt.getFirstSelectedOption().getText());
//		monthOpt.selectByVisibleText("January");
//		System.out.println(monthOpt.getFirstSelectedOption().getText());
//
//		// Date Dropdown Validation
		WebElement dateDrdn = driver.findElement(By.cssSelector("#daybox"));
		Select dateOpt = new Select(dateDrdn);

		System.out.println("is month multiple dropdown: " + dateOpt.isMultiple());

		List<WebElement> dateList = dateOpt.getOptions();
		System.out.println(dateList.size());
		for (int i = 0; i < dateList.size(); i++) {
			System.out.println(dateList.get(i).getText());
		}
		
//		List<Integer> actualDateList=new ArrayList<Integer>();
//		for(int i=1;i<dateList.size();i++) {
//			actualDateList.add(dateList.get(i)));
//			
//		}
//		System.out.println("Actual Date List: "+actualDateList);
//		List<String> dupDateList=new ArrayList<String>();
//		dupDateList.addAll(actualDateList);
//		Collections.sort(dupDateList);
//		System.out.println("Sorted List: "+dupDateList);
//		System.out.println(dupDateList.equals(actualDateList));
//		
//		dateOpt.selectByIndex(6);
//		System.out.println(dateOpt.getFirstSelectedOption().getText());
//		dateOpt.selectByValue("12");
//		// dateOpt.deselectByValue("12");
//		System.out.println(dateOpt.getFirstSelectedOption().getText());
//		dateOpt.selectByVisibleText("16");
//		System.out.println(dateOpt.getFirstSelectedOption().getText());
//		
		driver.close();

	}

}
