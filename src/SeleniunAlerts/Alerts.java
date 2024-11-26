package SeleniunAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52368940\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement al1= driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		al1.click();
		
		Alert a=driver.switchTo().alert();
		
		WebElement al2=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		al2.click();
		
	}

}
