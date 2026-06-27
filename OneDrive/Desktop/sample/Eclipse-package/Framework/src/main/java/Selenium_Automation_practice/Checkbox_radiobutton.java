package Selenium_Automation_practice;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Checkbox_radiobutton {
	public void checkbox() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.findElement(By.xpath("//ul[@id='bs_l_1']/preceding-sibling::span[@class='plus']")).click();
		driver.findElement(By.xpath("//input[@id='c_bf_2']/preceding-sibling::span[@class='plus']")).click();
		driver.findElement(By.xpath("//input[@id=\"c_io_6\"]")).click();    
    }
public void dropdown() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
	
	WebElement yes_button = driver.findElement(By.xpath("//label[contains(text(), 'Yes')]"));

    // Check if Yes is selected
    if (yes_button.isSelected()) {
        System.out.println("Yes is already selected.");
    } else {
        // Locate and select the Impressive radio button (input)
        WebElement impressive_button = driver.findElement(By.xpath("//input[@value='igotthree']"));
        impressive_button.click();
        System.out.println("Impressive was selected since Yes was not selected.");
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox_radiobutton box= new Checkbox_radiobutton();
		box.dropdown();

	}

}
