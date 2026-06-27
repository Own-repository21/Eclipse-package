package Selenium_Automation_practice;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Button_links {
	
	private void button(String option) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		if(option.equalsIgnoreCase("Click")) {
			driver.findElement(By.xpath("//button[contains(text(),'Click Me')][1]")).click();
			System.out.println("click me was selected");
		}
		else if(option.equalsIgnoreCase("Right")) {
			driver.findElement(By.xpath("//button[contains(text(),'Right')]")).click();
			System.out.println("Right click me was selected");
		}	
		else if(option.equalsIgnoreCase("Double")){
			driver.findElement(By.xpath("//button[contains(text(),'Double')]")).click();
			System.out.println("Double click me was selected");
		}
	}
	
	private void link() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
		//driver.findElement(By.xpath("//a[contains(text(),'HomewPWPU')]")).click();
        List<WebElement> links = driver.findElements(By.xpath("//a[@href=\"javascript:void(0)\"]"));
        for (WebElement link : links) {
        	 System.out.println("Clicking link: " + link.getText());
             link.click();
             Thread.sleep(3000);            
        }
		driver.quit();
	}
	private void page() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
		List<WebElement> links = driver.findElements(By.xpath("//a[@target=\"_blank\"]"));
		for (WebElement link : links) {
			System.out.println("Clicking link: " + link.getText());
			link.click();
			Thread.sleep(3000);
			String originalWindow = driver.getWindowHandle();
			driver.switchTo().window(originalWindow);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Button_links web = new Button_links();
		web.page();

	}

}
