package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		WebElement calender= driver.findElement(By.id("datepicker"));
		//calender.sendKeys("04/04/2000"+Keys.ENTER);
		calender.click();
		
		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton.click();
		
		WebElement prevButton = driver.findElement(By.xpath("//span[text()='Prev']"));
		prevButton.click();
		
		WebElement whereToGo = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		whereToGo.click();
	}

}
