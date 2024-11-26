package SeleniumFormFill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52368940\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//image one
				WebElement img= driver.findElement(By.xpath("//img[@id='angular']"));
				WebElement drag=driver.findElement(By.xpath("//div[@id='droparea']"));
				Actions actio=new Actions(driver);
				actio.dragAndDrop(img, drag).perform();
				//image two
				WebElement img2= driver.findElement(By.xpath("//img[@id='mongo']"));
				actio.dragAndDrop(img2, drag).perform();
				//image three
				WebElement img3= driver.findElement(By.xpath("//img[@id='node']"));
				actio.dragAndDrop(img3, drag).perform();

	}

}
