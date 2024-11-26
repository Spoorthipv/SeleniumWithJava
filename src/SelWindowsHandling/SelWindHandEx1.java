package SelWindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelWindHandEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52368940\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String pw=driver.getWindowHandle();
		System.out.println(pw);
//		//Thread.sleep(2000);
//		WebElement ex=driver.findElement(By.xpath("//main[@role='main']"));
//		ex.click();
//		
//		Set<String> aw=driver.getWindowHandles();
//		System.out.println(aw);
		
		//driver.switchTo().window("https://demo.automationtesting.in/Register.html")args;
	}

}
