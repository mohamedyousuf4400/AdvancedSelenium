package hyperlinks;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		WebElement homepagelink = driver.findElement(By.linkText("Go to Home Page"));
		homepagelink.click();
		
		driver.navigate().back();
		
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where"));
		String where = whereToGo.getAttribute("href");
		System.out.println("This link is going to "+where);
		
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
			if (title.contains("404")) {
				System.out.println("Link is broken");
			}
		
			driver.navigate().back();
			
			WebElement homepagelink1 = driver.findElement(By.linkText("Go to Home Page"));
			homepagelink1.click();
			
			driver.navigate().back();
			
			List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
			
			int linkCount = totalLinks.size();
			
			System.out.println("Total link :"+linkCount); 
	}

}
