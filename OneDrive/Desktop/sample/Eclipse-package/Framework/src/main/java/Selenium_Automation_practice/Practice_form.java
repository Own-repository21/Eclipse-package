package Selenium_Automation_practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_form {
	
	private void form() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");		
		driver.findElement(By.cssSelector("input[name=\"fullname\"]")).sendKeys("Maha R");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("maha2161996@gmail.com");
		driver.findElement(By.cssSelector("textarea[id=\"address\"]")).sendKeys("Radha nagar, perumbakkam, chennai");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Lakshmi");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_form form = new Practice_form();
		form.form();

	}

}
