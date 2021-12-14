package images;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		WebElement image1 = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		image1.click();
		
		WebElement toimage = driver.findElement(By.xpath("//img[@alt='Images']"));
		toimage.click();
		
		WebElement brokenimage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		if (brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is broken");
		}else {
			System.out.println("The Image is not broken");

		}
		
		
		
	}

}
