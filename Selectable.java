package selectables;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkWithSelectables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		
		int listsize = selectable.size();
		System.out.println(listsize);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2))
		.click(selectable.get(3))
		.build().perform();
		
		/*
		  Actions actions1 = new Actions(driver);
		  actions1.clickAndHold(selectable.get(4)) 
		  .clickAndHold(selectable.get(5))
		  .clickAndHold(selectable.get(6)).build().perform();
		 */
		
	}
}
