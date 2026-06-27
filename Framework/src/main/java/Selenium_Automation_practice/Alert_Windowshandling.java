package Selenium_Automation_practice;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Windowshandling {
	private void alert(String inputtext) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.findElement(By.xpath("//button[@onclick=\"showAlert()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@onclick=\"myMessage()\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
		Alert a1=driver.switchTo().alert();
		String heading= a1.getText();
		System.out.println(heading);
		a1.accept();
		
		driver.findElement(By.xpath("//button[@onclick=\"myDesk()\"]")).click();
		Alert a2=driver.switchTo().alert();
		String heading2= a2.getText();
		System.out.println(heading);
		a1.dismiss();
		
		driver.findElement(By.xpath("//button[@onclick=\"myPromp()\"]")).click();
		Alert a3=driver.switchTo().alert();
		String heading3= a3.getText();
		a3.sendKeys(inputtext);
		System.out.println(heading3+ " " + inputtext);
		a3.accept();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Alert_Windowshandling to = new Alert_Windowshandling();
		to.alert("Mahalakshmi Gowtham");

	}

}
