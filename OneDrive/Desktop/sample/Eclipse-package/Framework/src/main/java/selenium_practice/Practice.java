package selenium_practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice {
	private void data()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.close();
		driver.get("https://www.facebook.com/");
	//	driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
	//	driver.navigate().back();
		//driver.navigate().forward();
	//	driver.navigate().refresh();
//		driver.findElement(By.id("email")).sendKeys("mahalakshmi R");
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("pass");
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("maha");
//		driver.findElement(By.xpath("//button[contains(@class,'_42ft')]")).click();
//		driver.findElement(By.xpath("//button[starts-with(@class,'_42ft')]")).click();
//		driver.findElement(By.xpath("//input[contains(@class,'inputtext') and (@id='pass')]")).click();
//		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.xpath("//select[@id='day']//child::option[6]")).click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice s = new Practice();
		s.data();

	}

}
