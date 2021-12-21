package scrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithScrollDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
	        driver.navigate().to("http://www.echoecho.com/htmlforms11.htm");


	        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        
	        Thread.sleep(3000);


	        WebElement previousButton = driver.findElement(By.className("boxprevnext"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", previousButton);

	}

}
