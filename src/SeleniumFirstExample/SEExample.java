package SeleniumFirstExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class SEExample {

	public static void main(String[] args) {
		//chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52368940\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//URl
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//to maximize
		driver.manage().window().maximize();
		
		//to get the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		//to get the current URL
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		//to quit the browser
		//driver.quit();
		//to switch to alert
		//driver.switchTo().alert();
		}

}
