package tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkWithTables {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of columns : "+columnCount);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Number of rows : "+rowCount);
	
		WebElement getPercentage = driver.findElement(By.xpath
				("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		
		String percentage = getPercentage.getText();
		System.out.println("Percentage is "+percentage);
		
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		for (WebElement webElement : allProgress) {
			String individualValue = webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(individualValue));
		}
		
		System.out.println("Final List" +numberList);
		
		int smallValue =Collections.min(numberList);
		System.out.println(smallValue);
		
		String smallValueString = Integer.toString(smallValue)+"%";
		
		String finalXpath = "//td[normalize-space()="+"\""+ smallValueString + "\""+"]"+"//following::td[1]" ;
		System.out.println(finalXpath);
		Actions actions = new Actions(driver);
		Actions check = actions.moveToElement(driver.findElement(By.xpath(finalXpath)));
		check.click().build().perform();
		
		
		
		
		
	}

}
