package windowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow= driver.getWindowHandle();
		
		WebElement firstBtn = driver.findElement(By.id("home"));
		firstBtn.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		
		
		for (String newWindow : handles) {
			
			driver.switchTo().window(newWindow);
		}
		
		WebElement editBtn = driver.findElement(By.xpath("//h5[text()='Edit']"));
		editBtn.click();
		
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement multipleWindows = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		multipleWindows.click();
		
		int nWindows = driver.getWindowHandles().size();
		System.out.println("Number of open windows are : "+nWindows);
		
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		Set<String> newWindowHandles = driver.getWindowHandles();
		
		for (String allWindows : newWindowHandles) {
			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
			
		}
	}

}
