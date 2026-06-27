package Selenium_Automation_practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Table {
	public void webtable(String Firstname) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
	List<WebElement> total=driver.findElements(By.xpath("//table[@class=\"table table-striped mt-3\"]//tr"));
	for(int i=1;i<=total.size();i++) {
		String rowname= driver.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]//tr["+i+"]//td[4]")).getText(); 
		if(rowname.equalsIgnoreCase(Firstname)) {
			String emailid= driver.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]//tr[\"+i+\"]//td[4]")).getText();
			System.out.println(Firstname+ "is and the email id is "+emailid);
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table find=new Table();
		find.webtable("Alden");

	}

}
