package download;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();

		WebElement downloadlink = driver.findElement(By.linkText("Download Excel"));
		downloadlink.click();

		Thread.sleep(3000);

		//C:\Users\lenovo\Downloads

		File filelocation = new File("C:\\Users\\lenovo\\Downloads");
		File[] totalfiles = filelocation.listFiles();

		for (File file : totalfiles) {

			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("File is downloaded");
				break;
			}
		}
	}
}
