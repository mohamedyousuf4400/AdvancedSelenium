package alertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithAlertBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
          driver.navigate().to("http://www.javascriptkit.com/javatutors/alert2.shtml");
          driver.manage().window().maximize();

          //The sleep time is added to slow down the execution 
          //so that we can see what's happening
          Thread.sleep(2000);

          //Alert Accept
          WebElement alertBox1=driver.findElement(By.name("B2"));
          alertBox1.click();
          Thread.sleep(2000);
          Alert alert= driver.switchTo().alert();
          alert.accept();
          Thread.sleep(2000);
        
          //Alert Dismiss
          WebElement alertBox2=driver.findElement(By.name("B3"));
          alertBox2.click();
          Thread.sleep(2000);
          alert.dismiss();
          Thread.sleep(2000);
          alert.accept();

          //send input to alert
          WebElement alertBox3=driver.findElement(By.name("B4"));
          alertBox3.click();
          Thread.sleep(2000);
          alert.sendKeys("Yousuf");
          alert.accept();
          Thread.sleep(2000);
          alert.accept();        
	}

}
