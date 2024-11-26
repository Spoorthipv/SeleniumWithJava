package SeleniumFormFill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumFormExample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52368940\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Spoorthi");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("PV");
		
		//Thread.sleep(1000);
		
		WebElement address=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]"));
		address.click();
		address.sendKeys("bengaluru");
		
		WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys("spoorthipv28@gmail.com");
		
		WebElement Phone=driver.findElement(By.xpath("//input[@type='tel']"));
		Phone.sendKeys("9901326393");
		
		WebElement Gender=driver.findElement(By.xpath("//input[@value='FeMale']"));
		Gender.click();
		
		WebElement Hobbies=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		Hobbies.click();
		
		Thread.sleep(1000);
		
		WebElement Lang=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[1]"));
		Lang.click();
		
		WebElement lang1=driver.findElement(By.xpath("//a[normalize-space()='English']"));
		lang1.click();
		
		WebElement os=driver.findElement(By.xpath("//form[@id='basicBootstrapForm']"));
		os.click();
		
		WebElement Skill=driver.findElement(By.xpath("//select[@id='Skills']"));
		Skill.click();
		
		WebElement Skill1=driver.findElement(By.xpath("//option[@value='APIs']"));
		Skill1.click();
		
		os.click();
		
		WebElement Country=driver.findElement(By.xpath("//span[@role='combobox']"));
		Country.click();
		
		WebElement Country1=driver.findElement(By.xpath("//input[@role='textbox']"));
		Country1.sendKeys("India");
		
		WebElement SelectCountry=driver.findElement(By.xpath("//li[@role='treeitem']"));
		SelectCountry.click();
		os.click();
		
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		year.click();
		
		WebElement year1=driver.findElement(By.xpath("//option[@value='1996']"));
		year1.click();
		os.click();
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		month.click();
		
		WebElement month1=driver.findElement(By.xpath("//option[@value='April']"));
		month1.click();
		os.click();
		
		WebElement date=driver.findElement(By.xpath("//select[@id='daybox']"));
		date.click();
		
		WebElement date1=driver.findElement(By.xpath("//option[@value='28']"));
		date1.click();
		os.click();
		
		WebElement pw=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pw.sendKeys("Abc123");
		
		WebElement cpw=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		cpw.sendKeys("Abc123");
		
		WebElement Submit=driver.findElement(By.xpath("//button[@id='submitbtn']"));
		Submit.click();

	}

}
