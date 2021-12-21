package dropDownBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkWithDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
         driver.navigate().to("http://www.echoecho.com/htmlforms11.htm");
         driver.manage().window().maximize();

         WebElement dropDown= driver.findElement(By.name("dropdownmenu"));
       
         Select selectValue= new Select(dropDown);
         selectValue.selectByIndex(0); 

         Thread.sleep(2000);

         selectValue.selectByValue("Cheese"); 
         Thread.sleep(2000);

         selectValue.selectByVisibleText("Milk"); 
	}

}
