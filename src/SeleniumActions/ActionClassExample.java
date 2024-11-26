package SeleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52368940\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//move to element action
		WebElement E1= driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(E1).perform();
		
		WebElement E2=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
		ac.moveToElement(E2).perform();
		
		WebElement E3=driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']"));
		E3.click();
		
	}

}
