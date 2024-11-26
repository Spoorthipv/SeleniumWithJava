package SeleniumFirstExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52368940\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement un= driver.findElement(By.xpath("//input[@id=\"email\"]"));
		un.sendKeys("Spoorthi");
		
		WebElement pw= driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		pw.sendKeys("Password");

	}

}
